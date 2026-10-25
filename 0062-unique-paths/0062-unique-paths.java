class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        return ways(0,0,m,n,dp);  
    }
    public static int ways(int i,int j, int m, int n, int dp[][]){
        if(i>=m || j>=n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if (dp[i][j] != 0) return dp[i][j];
        int w1=ways(i+1,j,m,n,dp);//down
        int w2=ways(i,j+1,m,n,dp); //right
        return dp[i][j]= w1+w2;
    }
}