class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        input.add(nums[i]);
        
        subsets(ans,input,new ArrayList<>(),0);
        return ans;
    }
    
     void subsets(List<List<Integer>> ans, ArrayList<Integer> input, ArrayList<Integer> output, int index)
     {
         if(index == input.size())
         {
             ans.add(output);
             return;
         }
         
         subsets(ans,input,new ArrayList<>(output), index+1);
         output.add(input.get(index));
         subsets(ans,input,new ArrayList<>(output), index+1);
     }
}