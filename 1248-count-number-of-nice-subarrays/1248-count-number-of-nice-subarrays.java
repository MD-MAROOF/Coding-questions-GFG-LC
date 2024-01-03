class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        return atmost(nums,k) - atmost(nums,k-1);
        
    }
    
    public int atmost(int[] nums, int k)
    {
        int count=0,ans=0,start=0;
        
        for(int end=0;end<nums.length;end++)
        {
            if(nums[end] % 2 != 0)
                count++;
            
            while(start <= end && count>k)
            {
                if(nums[start++] %2 != 0)
                {
                    count--;
                    
                }
            }
            ans = ans + (end-start+1);
            
        }
        
        return ans;
    }
}