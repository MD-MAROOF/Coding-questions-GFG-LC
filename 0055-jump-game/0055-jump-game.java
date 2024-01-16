class Solution {
    public boolean canJump(int[] nums) {
        
        
        int n = nums.length;
        
        int index = n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(i + nums[i] >= index)
                index = i;
        }
        
        if(index == 0)
            return true;
        
        return false;
    }
    
}