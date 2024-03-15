class Solution {
    public int longestSubarray(int[] nums) {
        
        int l=0,r=0;
        
        int ans=0,k=1,z=-1;
        
        while(r < nums.length)
        {
            if(nums[r] == 0)
            {
                if(k > 0)
                {
                    k = k-1;
                    z=r;
                }
                else{
                    ans = Math.max(ans,r-l-1);
                    l = z+1;
                    k=1;
                    continue;
                }
            }
            
            if(r == nums.length-1)
            {
                if(nums[r] == 1)
                ans = Math.max(ans,r-l);
             }
            r+=1;
        }
        
        return ans;
    }
}