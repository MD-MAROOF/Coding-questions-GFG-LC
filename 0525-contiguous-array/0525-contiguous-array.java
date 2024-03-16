class Solution {
    public int findMaxLength(int[] nums) {
        //To find the maximum length of a contiguous subarray with an equal number of 0s and 1s, we can use the concept of prefix sum. Whenever we encounter a 0, we decrement the sum by 1, and whenever we encounter a 1, we increment the sum by 1. If the prefix sum at two indices is the same, it means that the number of 0s and 1s between those two indices is the same. We store these prefix sums along with their indices in a hash map. Then, for each prefix sum encountered, we check if we have seen this sum before. If so, it means that the subarray between the current index and the index where this sum was last encountered has an equal number of 0s and 1s. We calculate the length of this subarray and update the maximum length accordingly.
        
        
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        int subArrayLength = 0;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
                sum = sum - 1;
            else
                sum = sum + 1;
            
            if(sum == 0)
                subArrayLength = i + 1;
            else if(map.containsKey(sum))
                subArrayLength = Math.max(subArrayLength, i-map.get(sum));
            else
                map.put(sum,i);
        }
        
        return subArrayLength;
    }
}