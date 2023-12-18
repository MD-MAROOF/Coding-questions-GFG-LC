//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        ArrayList<String> ans = new ArrayList<>();
        String str = "";
        function(ans,n,0,0,str);
        return ans;
    }
    
 void function(ArrayList<String> ans, int n, int open, int close, String str)
    {
        if(str.length() == n*2)
        {
            ans.add(str);
            return;
        }
        
        if(open < n)
            function(ans,n,open+1,close,str+"(");
        if(close < open)
            function(ans,n,open,close+1,str+")");
    }
}