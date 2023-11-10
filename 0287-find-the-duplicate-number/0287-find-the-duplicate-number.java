class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        
        int ans=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(entry.getValue() >= 2){
             ans = entry.getKey();
            break;
            }
        }
        
        return ans;
    }
}