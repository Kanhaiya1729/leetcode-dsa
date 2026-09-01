class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0 || n==1 ){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
       for(int i=0;i<=n-k;i++){
        int max=0;
       int min=Integer.MAX_VALUE;
        for(int j=i;j<i+k;j++){
            max=Math.max(max,nums[j]);
            min=Math.min(min,nums[j]);

        }
        int diff=(Math.abs(max-min));
        ans=Math.min(diff,ans);
    

       }
       return ans;


       

        }

        
    }
