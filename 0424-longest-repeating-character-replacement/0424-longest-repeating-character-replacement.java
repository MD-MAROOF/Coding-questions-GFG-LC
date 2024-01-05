class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLength = 0;
        int maxRepeatCount = 0;
        int left = 0, len = s.length();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int right = 0; right < len; right++)
        {
            char curr = s.charAt(right);
            map.put(curr,map.getOrDefault(curr,0)+1);
            
            maxRepeatCount = Math.max(maxRepeatCount, map.get(curr));
            int nonRepeat = (right - left  + 1) - maxRepeatCount;
            
            //window size = (right - left + 1);
            
            if(nonRepeat > k)
            {
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}