class Solution {
    public void sortColors(int[] nums) {
        int low = 0,high = nums.length-1;
        mergeSort(nums,low,high);
        
    }
    
    void mergeSort(int[] nums,int low,int high)
    {
        if(high > low)
        {
            int mid = low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    
    void merge(int[] arr, int low,int mid, int high)
    {
        int n1 = mid-low+1;
        int n2 = high-mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i=0;i<n1;i++)
        {
            left[i] = arr[low + i];
        }
        
        for(int i=0;i<n2;i++)
        {
            right[i] = arr[mid+i+1];
        }
        
        int i=0,j=0,k=low;
        
        while(i < n1 && j < n2)
        {
            if(left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            
            else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        
        while(i < n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while(j < n2)
        {
            arr[k] = right[j];
            j++;k++;
        }
    }
}