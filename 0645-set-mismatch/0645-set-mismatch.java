class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length+1];
        int[] res = new int[2];
        
        for(int num : nums)
            count[num]++;
        
        for(int i=0;i<count.length;i++)
        {
            if(count[i] > 1)
                res[0] = i;
            else if(count[i] ==0)
                res[1] = i;
        }
        
        return res;
    }
}