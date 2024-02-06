class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        String[] sorted = new String[strs.length];
       
            for(int i=0;i<strs.length;i++)
            {
                String str = strs[i];
                char[] sortedstring = str.toCharArray();
                Arrays.sort(sortedstring);
                sorted[i] = new String(sortedstring);
            }
        
      //  ArrayList<List<String>> res = new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        
         for(int i=0;i<strs.length;i++)
         {
             if(!map.containsKey(sorted[i]))
                 map.put(sorted[i], new ArrayList<>());
             
             map.get(sorted[i]).add(strs[i]);
         }
        
        return new ArrayList<>(map.values());
    }
}