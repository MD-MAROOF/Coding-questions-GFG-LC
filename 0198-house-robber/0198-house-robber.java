class Solution {
    public int rob(int[] nums) {   //I COPY PASTED THE SOLUTION. i DON'T KNOW DP
        int n = nums.length;

        int[] dp = new int[2];

        dp[1] = nums[0];

        for(int i = 2; i <= n; i++){
            int curr = nums[i - 1];

            dp[i%2] = Math.max(dp[(i - 2) % 2] + curr, dp[(i-1)%2]); 
        }

        return dp[n%2];
    }
}