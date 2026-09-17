class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
       int i=0;
       while(i<nums.length && k>0 && nums[i]<0){
        nums[i]=-nums[i];
        k--;
        i++;
       }
       if(k%2==1){
        Arrays.sort(nums);
        nums[0]=-nums[0];
       }
    for(int x:nums){
       sum+=x;
    }
    return sum;


        }
        
        
    }
