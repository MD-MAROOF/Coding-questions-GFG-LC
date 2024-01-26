class Solution {
    int mod=1000000007;      //I haven't solved this on my own
    int maxMove;
    int m;
    int n;
    Integer[][][] memo;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo=new Integer[m][n][maxMove+1];
        this.maxMove=maxMove;
        this.m=m;
        this.n=n;
        return findPaths(startRow,startColumn,0);
    }
    public int findPaths(int i, int j, int move) {
        if(move>maxMove){
            return 0;
        }
        if(i<0 || i>=m || j<0 || j>=n){
            return 1;
        }
        if(memo[i][j][move]!=null){
            return memo[i][j][move];
        }
        int count=0;
        count=(count+findPaths(i+1,j,move+1))%mod;
        count=(count+findPaths(i,j+1,move+1))%mod;
        count=(count+findPaths(i-1,j,move+1))%mod;
        count=(count+findPaths(i,j-1,move+1))%mod;
        memo[i][j][move]=count;
        return memo[i][j][move]%mod;
    }
}