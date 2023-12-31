class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start_index = -1;
        int start = 0, end = nums.length-1;
        
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid] == target)
            {
                start_index = mid;
                end = mid-1;
            }
            
            else if(target > nums[mid])
                start = mid + 1;
            
            else if(target < nums[mid])
                end = mid - 1;
        }
        
        start = 0;
        end = nums.length-1;
        int end_index = -1;
        
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid] == target)
            {
                end_index = mid;
                start = mid + 1;
            }
            
            else if(target > nums[mid])
                start = mid + 1;
            
            else if(target < nums[mid])
                end = mid - 1;
        }
        
        int[] ans = new int[2];
        
        ans[0] = start_index;
        ans[1] = end_index;
        
        return ans;
    }
}