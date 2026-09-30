class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
         int dp[]=new int[n];
         if(n==1){
            return nums[0];
         }
         if(n==2){
            return Math.max(nums[0],nums[1]);
         }
         return Math.max(robLinear(nums,0,n-2,dp),robLinear(nums,1,n-1,dp));
       
    }
    public int robLinear(int nums[],int start,int end,int dp[]){
        dp[start]=nums[start];
        if(start+1<=end){
            dp[start+1]=Math.max(nums[start],nums[start+1]);

        }
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);

        }
        return dp[end];
       
    }
}