class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n+1];
        int ans[]=new int[n];
        prefix[0]=0;
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];

        }
        for(int i=0;i<n;i++){
            int LS=prefix[i];
            int RS=prefix[n]-prefix[i+1];
            ans[i]=Math.abs(RS-LS);
        }
        return ans;

        
    }
}