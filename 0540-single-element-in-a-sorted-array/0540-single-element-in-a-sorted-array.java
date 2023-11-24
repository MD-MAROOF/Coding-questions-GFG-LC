class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        
        int ans = -1;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(entry.getValue() == 1)
                ans = entry.getKey();
        }
        return ans;
    }
}