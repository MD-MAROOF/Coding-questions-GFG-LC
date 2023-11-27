class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length, n2 = nums2.length;
        
        int[] temp = new int[n1 + n2];
        
        int i=0,j=0,k=0;
        
        while(i < n1 && j < n2)
        {
            if(nums1[i] <= nums2[j])
            {
                temp[k] = nums1[i];
                k++;i++;
            }
            
             else
            {
                temp[k] = nums2[j];
                k++;j++;
            }
            
        }
         while(i < n1)
         {     
             temp[k] = nums1[i];
             i++;k++;
         }
        
        while(j < n2)
        {
            temp[k] = nums2[j];
            j++;k++;
        }
      System.out.println(Arrays.toString(temp));
        int n = temp.length;
        
        if(n%2 == 0)
        {
            double val = temp[n/2] + temp[(n/2)-1];
            double ans = val/2;
            return ans;
        }
        else
        {
            double ans = temp[n/2];
            return ans;
        }
    }
}