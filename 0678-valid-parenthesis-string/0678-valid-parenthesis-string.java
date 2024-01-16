class Solution {
    public boolean checkValidString(String s) {
     
        Stack<Integer> open_braces = new Stack<>();
        Stack<Integer> star = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
                open_braces.push(i);
            
            else if(s.charAt(i) == '*')
                star.push(i);
            
            else{
                if(!open_braces.isEmpty())
                    open_braces.pop();
                
                else if(!star.isEmpty())
                    star.pop();
                
                else
                    return false;
            }
        }
        
        while(open_braces.size()!= 0)
        {
            if(star.size() == 0)
                return false;
            
            if(star.peek() > open_braces.peek())
            {
                star.pop();
                open_braces.pop();
            }
            else{
                return false;
            }
        }
        
        return true;
            
    }
}