class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(set);
        
        int count=0,maxcount = 0;
        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)+1 == arr.get(i+1))
                count++;
            else
                count=0;
            
            if(maxcount < count)
                maxcount = count;
        }
        
        return maxcount+1;
        
    }
}