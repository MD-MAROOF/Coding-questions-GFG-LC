class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> sub = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
            input.add(nums[i]);
        
        findSubsets(sub,input,new ArrayList<>(),0);
        return sub;
    }
    
    public void findSubsets(List<List<Integer>> subs, ArrayList<Integer> arr, ArrayList<Integer> output, int index)
    {
        if(index == arr.size())
        {
            subs.add(output);
            return;
        }
        
        findSubsets(subs,arr,new ArrayList<>(output),index+1);
        output.add(arr.get(index));
        findSubsets(subs,arr,new ArrayList<>(output),index+1);
    }
}