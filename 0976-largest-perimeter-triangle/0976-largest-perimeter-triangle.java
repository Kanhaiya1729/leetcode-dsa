class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       for(int right=n-1;right>=2;right--){
        int left=right-1;
        int third=right-2;
        if(nums[third]+nums[left]>nums[right]){
            int sum=nums[right]+nums[left]+nums[third];
            return  sum;
       }
        
    }
    return 0 ;
}
}