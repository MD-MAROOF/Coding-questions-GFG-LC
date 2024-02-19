class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        return isPower(n,i);
    }
    
    public boolean isPower(int n,int i)
    {
        if( Math.pow(2,i) > n || n ==0 )
            return false;
        
        if(Math.pow(2,i) == n)
            return true;
        
        return isPower(n,i+1);
    }
}