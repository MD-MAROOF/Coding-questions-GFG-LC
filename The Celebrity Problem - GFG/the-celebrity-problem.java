//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> stk = new Stack<>();
    	
    	for(int i=0;i<n;i++)
    	stk.push(i);
    	
    	while(stk.size() > 1)
    	{
    	    int a = stk.peek();
    	    stk.pop();
    	    
    	    int b = stk.peek();
    	    stk.pop();
    	    
    	    if(knows(M,a,b,n))
    	        stk.push(b);
    	    else
    	    stk.push(a);
    	    
    	}
    	
    	int candidate = stk.peek();
    	
    	boolean rowCheck = false;
    	int zeroCount = 0;
    	
    	for(int i=0;i<n;i++)
    	{
    	    if(M[candidate][i] == 0)
    	    zeroCount++;
    	}
    	
    	if(zeroCount == n)
    	rowCheck = true;
    	
    	boolean colCheck = false;
    	int oneCount = 0;
    	
    	for(int i=0;i<n;i++)
    	{
    	    if(M[i][candidate] == 1)
    	    oneCount++;
    	}
    	
    	if(oneCount == n-1)
    	colCheck = true;
    	
    	if(rowCheck == true && colCheck == true)
    	return candidate;
    	
    	else
    	return -1;
    	
    }
    
    public boolean knows(int[][] M, int a, int b, int n)
    {
        if(M[a][b] == 1)
        return true;
        else
        return false;
    }
}