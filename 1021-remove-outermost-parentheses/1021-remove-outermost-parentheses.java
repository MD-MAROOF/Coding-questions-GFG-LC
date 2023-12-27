class Solution {
    public String removeOuterParentheses(String s) {
        
        String ans = "";
        Stack<Character> stk = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '(')
            {
                if(!stk.isEmpty())
                    ans = ans + ch;
                
                stk.push(ch);
            }
            else{
                stk.pop();
                if(!stk.isEmpty())
                    ans = ans + ch;
            }
        }
        
        return ans;
    }
}