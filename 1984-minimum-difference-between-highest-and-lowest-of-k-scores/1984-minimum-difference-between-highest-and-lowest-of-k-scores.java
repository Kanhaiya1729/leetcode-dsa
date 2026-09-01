class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0 || n==1 ){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int min=nums[i];
            int max=nums[i+k-1];
            int diff=Math.abs(max-min);
            ans=Math.min(ans,diff);
        }
        
       return ans;
    }  

        }

        
    
