class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int num : nums)
        {
            map.put(num,true);
        }
        
        for(int i=1;i<=nums.length;i++)
        {
            if(!map.containsKey(i))
                return i;
        }
        
        return nums.length+1;
    }
}