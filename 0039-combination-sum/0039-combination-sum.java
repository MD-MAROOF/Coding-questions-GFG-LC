class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      //  List<List<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<candidates.length;i++)
            arr.add(candidates[i]);
        
        ArrayList<Integer> temp = new ArrayList<>();
        solve(0,arr,temp,target);
        return ans;
    }
    
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int i, List<Integer> arr, List<Integer> temp, int target)
    {
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        if(target < 0)
            return;
        
        if(i == arr.size())
            return;
        
        solve(i+1,arr,temp,target);
        temp.add(arr.get(i));
        solve(i,arr,temp,target-arr.get(i));
        temp.remove(temp.size()-1);
        
    }
}