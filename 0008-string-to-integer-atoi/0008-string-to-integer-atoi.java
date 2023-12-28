class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        if(s.isEmpty())
            return 0;
        
        int sign = +1;
        long ans = 0;
        
        if(s.charAt(0) == '-')
            sign = -1;
        
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        
        int i=0;
        
        i = (s.charAt(i) == '+' || s.charAt(i) == '-')?1:0;
        
        while(i < s.length())
        {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i)))
                break;
            
            ans = ans * 10 + s.charAt(i)-'0';
            
            if(sign == -1 && -1 * ans < MIN)
                return MIN;
            
            if(sign == 1 && ans > MAX)
                return MAX;
            
            i++;
        }
        
        return (int)(sign * ans);
    }
}