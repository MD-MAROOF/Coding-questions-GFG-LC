class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int p=0,n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                pos[p] = nums[i];
                p++;
            } 
            else
            {
                neg[n] = nums[i];
                n++;
            }
        }
        p=0;n=0;
        for(int i=0;i<nums.length;i++)
        {
         if(i%2 == 0)
         {
             ans[i] = pos[p];
             p++;
         }
            else
            {
                ans[i] = neg[n];
                n++;
            }  
        }
        
        return ans;
        
    }
}