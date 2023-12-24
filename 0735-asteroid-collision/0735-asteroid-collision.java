class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<asteroids.length;i++)
        {
    //if stk is empty or a +ve element arrives, just perform blind insertion
            if(asteroids[i] > 0 || stk.isEmpty())
                stk.push(asteroids[i]);
            else{
                
                while(!stk.isEmpty())
                {
                    int top = stk.peek();
                    
                    if(top < 0)
                    {
                         stk.push(asteroids[i]);
                        break;
                    }
                    
                    int mod = Math.abs(asteroids[i]);
                    if(mod == top)
                    {
                        stk.pop();
                        break;
                    }
                    else if(mod < top)
                        break;
                    else{
                        stk.pop();
                        if(stk.isEmpty())
                        {
                            stk.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        
        int len = stk.size();
        int[] ans = new int[len];
        
        for(int i=len-1;i>=0;i--)
            ans[i] = stk.pop();
        
        return ans;
    }
}