//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends




//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int l=0,r=arr.length-1;

        
        return Mergesort(arr,l,r);
        
    }
    
    static long Mergesort(long[] arr, int l, int r)
    {
        while(l<r)
        {
           int m = (l+r)/2;
           long res=0;
            res += Mergesort(arr,l,m);
            res += Mergesort(arr,m+1,r);
            res += Mergeandcount(arr,l,m,r);
            return res;
        }
     return 0;
    }
    
    static long Mergeandcount(long[] arr, int l, int m, int r)
    {
        int n1 = m-l+1,n2=r-m;
      //  long res=0;
        long[] left = new long[n1];
        long[] right = new long[n2];
        
        for(int i=0;i<n1;i++)
        left[i] = arr[l+i];
        
        for(int i=0;i<n2;i++)
        right[i] = arr[m+1+i];
        
     long res = 0;
        int i=0,j=0,k=l;
        while(i < n1 && j < n2)
        {
            if(left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
                res = res + (n1-i);
                
            }
            k++;
        }
        
        while(i < n1 )
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while(j < n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
        
    }
}