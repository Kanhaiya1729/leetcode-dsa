class Solution {
    public int change(int amount, int[] coins) {
    int n=coins.length;
    int m=amount;
    int dp[][]=new int[n+1][m+1];
     for(int i=0;i<n+1;i++){
        dp[i][0]=1;
     }
     for(int j=0;j<m+1;j++){
        dp[0][j]=0;
     }
     for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){     
            int v=coins[i-1];
            if(v<=j){
                dp[i][j]=dp[i][j-v]+dp[i-1][j];
            }else{
                dp[i][j]=dp[i-1][j];
            }
        }
     }  
     return dp[n][m];

    }
}