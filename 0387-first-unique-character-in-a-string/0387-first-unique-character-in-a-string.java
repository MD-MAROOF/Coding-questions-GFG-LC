class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
            hm.put(s.charAt(i),1);
        }
        int count = 0;

      char ch='\0';
        for(Map.Entry<Character,Integer> entry: hm.entrySet())
        {
            if(entry.getValue() == 1){
                 ch = entry.getKey();
                 count++;
            break;
            }
        }

        if(count == 0)
        return -1;
      int i;
        for( i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ch)
            break;
        }
        return i;
    }
}