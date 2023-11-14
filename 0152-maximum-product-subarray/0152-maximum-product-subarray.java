class Solution {
    public int maxProduct(int[] nums) {
        
        //USING KADANE'S algo.
        
        //traversing the array from left to right
        int max = Integer.MIN_VALUE,prod=1;
        
        for(int i=0;i<nums.length;i++)  
        {
            prod *= nums[i];
            
            if(prod > max)
                max = prod;
            if(prod == 0)
                prod = 1;
        }
        
        //traversing the array from right to left
        
        prod = 1;
        
        for(int i=nums.length-1;i>=0;i--)
        {
            prod *= nums[i];
            
            if(prod > max)
                max = prod;
            
            if(prod == 0)
                prod = 1;
            
        }
        
        //finally returnning the maximum product
        
        return max;
    }
}