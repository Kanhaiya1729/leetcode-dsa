class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int x:nums){
          sum+=x;
        }
        int half=sum/2;
        int m=half;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                int val=nums[i-1];
                if(val<=j){
                  dp[i][j]=Math.max(val+dp[i-1][j-val],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        return dp[n][m]== sum-half ? true : false ;
        
    }
}