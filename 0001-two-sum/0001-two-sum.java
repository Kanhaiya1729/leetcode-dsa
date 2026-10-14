class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
      while(start<nums.length-1){
       for(int i=start+1;i<nums.length;i++){
         int sum=nums[start]+nums[i];
         if(sum==target){
            return new int[]{start,i};
         }
       }
       start++;
    }
    return new int[]{-1,-1};
    }
}