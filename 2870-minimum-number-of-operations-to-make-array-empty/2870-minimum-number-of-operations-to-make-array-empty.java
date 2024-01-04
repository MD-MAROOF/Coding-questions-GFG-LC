class Solution {
    public int minOperations(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
          int t = entry.getValue();
            if(t == 1)
                return -1;
            
              count += t / 3; // Count the complete sets of 3 elements
            if (t % 3 != 0) // If there are remaining elements, increment the count
                count++;
        }
        
        return count;
        
    }
}