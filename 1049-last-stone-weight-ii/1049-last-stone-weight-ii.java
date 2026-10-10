class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int sum=0;
        for(int x: stones){
            sum+=x;

        }
        int halfSum=sum/2;
        int dp[][]=new int[n+1][halfSum+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<halfSum+1;j++){
            int w=stones[i-1];
              if(w<=j){
                int enc=stones[i-1]+dp[i-1][j-w];
                int exc=dp[i-1][j];
               dp[i][j]=Math.max(enc,exc);

        }else{
            dp[i][j]=dp[i-1][j];
        }
        }   
    }
     return sum-2*dp[n][halfSum];
}
}