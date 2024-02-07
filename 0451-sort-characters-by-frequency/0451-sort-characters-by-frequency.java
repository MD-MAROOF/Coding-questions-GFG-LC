class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
            map.put(s.charAt(i),1);
        }

        List<Map.Entry<Character,Integer>> sortedlist = new ArrayList<>(map.entrySet());
        Collections.sort(sortedlist,new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });

        String lastString = "";
        for (Map.Entry<Character,Integer> e : sortedlist)
        {
            for(Integer j =0; j < e.getValue();j++)
            lastString += e.getKey().toString();
        }
        return lastString;
    }
}