class Solution {
    public int minOperations(int[] nums) {
        
        /* 
1. It uses a map mp to calculate the frequency of each number in nums.

2. If any number occurs only once in nums, it's impossible to achieve the desired pattern, so the function returns -1.

3.It calculates the number of moves needed to make all occurrences of each number a multiple of 3. If there are remaining occurrences (not divisible by 3), it adds one more move for each such occurrence.

4. Finally, it returns the total number of moves needed to achieve the desired pattern.
        */
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
            
        }
        
        
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int t = entry.getValue();
            
            if(t == 1)
                return -1;
            
            count = count + (t/3);
            if(t % 3 != 0)
                count++;
        }
        
        return count;
    }
}