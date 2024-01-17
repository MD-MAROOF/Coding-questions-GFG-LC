class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) 
        {                                                            
            map.put(i,map.getOrDefault(i,0)+1); 
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            set.add(entry.getValue());
        }
        
        if(set.size() == map.size())
            return true;
        return false;
    }
}