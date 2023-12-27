class Solution {
    public String removeOuterParentheses(String s) {
        
        int count = 0;
        boolean flag = true;
        String res = "";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
                count++;
            else
                count--;
            
            if(count == 1 && flag == true)
            {
                flag = false;
                continue;
            }
            
            if(count == 0 && flag == false)
            {
                flag = true;
                continue;
            }
            
            res = res + s.charAt(i);
        }
        
         return res;    
    }
}