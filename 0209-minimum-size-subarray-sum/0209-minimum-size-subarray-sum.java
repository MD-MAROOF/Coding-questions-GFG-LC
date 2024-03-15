class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        
        for (int high = 0; high < nums.length; high++) {
            sum += nums[high];
            
            while (sum >= target) {
                minLen = Math.min(minLen, high - low + 1);
                sum = sum - nums[low];
                low++;
            }
        }
        
        
        if(minLen == Integer.MAX_VALUE)
            return 0;
        
        return minLen;
    }
}