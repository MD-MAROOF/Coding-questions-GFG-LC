class Solution {
    public int findMaxLength(int[] nums) {
        
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