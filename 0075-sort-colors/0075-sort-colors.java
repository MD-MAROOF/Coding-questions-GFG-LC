class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int high = nums.length-1;
        quickSort(nums,low,high);
    }
    
    void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot);
            quickSort(arr,pivot+1,high);
        }
    }
    
    int partition(int[] arr, int low, int high)
    {
     int pivot = arr[low];
        int i=low-1,j=high+1;
        
        while(true)
        {
            do{
                i++;
            }while(arr[i] < pivot);
                do{
                    j--;
                }while(arr[j] > pivot);
                    if(i >= j)
                        return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}