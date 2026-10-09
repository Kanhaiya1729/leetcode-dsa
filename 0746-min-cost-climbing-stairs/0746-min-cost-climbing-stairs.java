class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==0){
            return 0;
        }
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<n+1;i++){
            int idx0=dp[i-1]+cost[i-1];
            int idx1=dp[i-2]+cost[i-2];
            dp[i]=Math.min(idx0,idx1);
        }
        return dp[n];
        
    }
}