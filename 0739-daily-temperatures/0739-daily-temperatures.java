
class Solution{
    public int[] dailyTemperatures(int[] temps)
    {
        int[] results = new int[temps.length];
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<temps.length;i++)
        {
            while(!stk.isEmpty() && temps[stk.peek()] < temps[i])
                results[stk.peek()] = i - stk.pop();
            
             stk.push(i);
        }
      
        return results;
    }
}

