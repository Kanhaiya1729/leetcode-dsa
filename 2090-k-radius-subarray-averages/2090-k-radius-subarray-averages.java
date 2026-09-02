class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        long prefix[]=new long[n+1];
        prefix[0]=0;
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(i-k <0 || i+k >=n){
                nums[i]=-1;
            }else{
               long sum=prefix[i+k+1]-prefix[i-k];
               nums[i]=(int) (sum/(2*k+1));
            }
        }
              return nums;

            
        }
      

        
    }
