class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n =nums.length;
        int sum=0;
        for(int x: nums){
            sum+=x;
        }
        if(Math.abs(target)>sum){
            return 0;
        }
        if((sum+target)%2!=0){
            return 0;
        }
        int m=(sum+target)/2;
        int dp[][]=new int[n+1][m+1];
       
        dp[0][0]=1;

         
        for(int i=1;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                int w=nums[i-1];
                dp[i][j]=dp[i-1][j];
                if(w<=j){
                   dp[i][j]+=dp[i-1][j-w];
                }
            }
        }
        return dp[n][m];


        
    }
}