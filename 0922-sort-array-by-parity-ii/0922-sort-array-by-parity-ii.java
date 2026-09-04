class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int n=nums.length;
       int left=0;
       int even=0;
       int odd=1;
       while(even<n && odd<n){
        while(even<n && nums[even]%2==0){
            even+=2;
        }
        while(odd<n && nums[odd]%2!=0){
            odd+=2;
        }
        if(even < n && odd<n){
        int temp=nums[odd];
        nums[odd]=nums[even];
        nums[even]=temp;
       }
       
    
        
    }
       return nums;
}
}