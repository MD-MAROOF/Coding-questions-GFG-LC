class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] == i)
            continue;
            else
            break;
        }
        return i;
    }
}