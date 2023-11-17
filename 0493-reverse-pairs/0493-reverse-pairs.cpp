class Solution {
public:
  int merge(vector<int> &nums, int l, int m, int r){
      int count = 0;
      vector<int>left(nums.begin()+l,nums.begin()+m+1);
      vector<int>right(nums.begin()+m+1,nums.begin()+r+1);

      int ansIdx = l, leftIdx = 0, rightIdx = 0, n1 = left.size(),n2 = right.size();
      //count reverse pairs
      while(leftIdx < n1 && rightIdx < n2){
            if (left[leftIdx] > 2LL*right[rightIdx]){
                count += n1-leftIdx;
                rightIdx++;
            }
            else
                leftIdx++;
      }
      ansIdx = l, leftIdx = 0, rightIdx = 0, n1 = left.size(),n2 = right.size();
      while(leftIdx < n1 && rightIdx < n2){
          if (left[leftIdx] <= right[rightIdx])
              nums[ansIdx++] = left[leftIdx++];
          else{
            nums[ansIdx++] = right[rightIdx++];
          }     
      }
      while (leftIdx < n1)
          nums[ansIdx++] = left[leftIdx++];
      while (rightIdx < n2)
          nums[ansIdx++] = right[rightIdx++];
      return count;
  }
  int mergeSort(vector<int> &nums, int l, int r){
      int count = 0;
      if (l == r) return count;
      int m = l + (r-l)/2;
      //left part sort
      count += mergeSort(nums,l,m);
      //right part sort
      count += mergeSort(nums,m+1,r);
      //merge these sorted array
      count += merge(nums,l,m,r);
      return count;
  }
    int reversePairs(vector<int>& nums) {
        return mergeSort(nums,0,nums.size()-1);
    }
};