class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        
        for(int i=0;i<k;i++)
            sum = sum + nums[i];
        
        double max_avg = (double)sum/k;
        
        for(int i=k;i<nums.length;i++)
        {
            sum = sum + nums[i] - nums[i-k];
            max_avg = Math.max(max_avg , (double)sum/k);
        }
        
        return max_avg;
    }
}