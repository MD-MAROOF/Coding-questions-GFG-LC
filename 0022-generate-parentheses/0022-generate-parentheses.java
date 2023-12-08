class Solution {
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> ans = new ArrayList<>();
        
        function(ans,n,0,0,"");
        return ans;
    }
    
    void function(List<String> ans, int n, int open, int close, String str)
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