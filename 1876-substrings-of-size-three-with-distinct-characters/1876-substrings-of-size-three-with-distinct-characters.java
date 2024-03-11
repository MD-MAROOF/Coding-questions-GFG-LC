class Solution {
    public int countGoodSubstrings(String s) {
        
         if(s.length() < 3){
            return 0;
        }
        
        HashSet<Character> set = new HashSet<>();
        
        int i = 0,count=0;
    
        while(i<s.length()-2){
            
            String t = s.substring(i, i+3);
            char c[] = t.toCharArray();
            
            for(char c1:c){
                set.add(c1);
            }
            if(set.size() == 3){
                count++;
            }
            set.clear();
            i++;
        }
        
        return count;
    }
}
    