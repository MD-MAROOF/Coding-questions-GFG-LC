class Solution {
    public long largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        long pref_sum = nums[0] + nums[1];
        long ans = 0;
        
        for(int i=2;i<nums.length;i++)
        {
            if(pref_sum > nums[i])
                ans = Math.max(ans,pref_sum + nums[i]);
            
            pref_sum = pref_sum + nums[i];
        }
        
        return (ans == 0) ? -1 : ans;
    }
}