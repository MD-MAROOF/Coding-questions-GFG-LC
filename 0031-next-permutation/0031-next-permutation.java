class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums.length == 1)
            return;
        
        int idx1=Integer.MIN_VALUE;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1]){
                idx1 = i;
                break;
            }
        }
        
        if(idx1 < 0)
            reverse(nums,0,nums.length-1);
        else
        {
           int idx2=0;
            for(int i=nums.length-1;i>=0;i--)
            {
                if(nums[i] > nums[idx1])
                {
                    idx2 = i;
                    break;
                }
            }
            
            int swap = nums[idx1];
            nums[idx1]=nums[idx2];
            nums[idx2] = swap;
            
            reverse(nums,idx1+1,nums.length-1);
        }
    }
    
    void reverse(int[] nums,int start,int end)
    {
        while(start <= end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}