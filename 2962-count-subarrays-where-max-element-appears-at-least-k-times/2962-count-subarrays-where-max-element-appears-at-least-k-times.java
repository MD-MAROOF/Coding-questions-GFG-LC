class Solution {
    public long countSubarrays(int[] nums, int k) {
        int mx = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int l = 0,r=0,n=nums.length;
        
        while (r < n) {
            
            if(nums[r] == mx)
                k--;
        //    k -= nums[r] == mx ? 1 : 0;
            r++;
            while (k == 0) {
              //  k += nums[l] == mx ? 1 : 0;
                if(nums[l] == mx)
                    k++;
                l++;
            }
            ans += l;
        }
        
        return ans;
    }
}
