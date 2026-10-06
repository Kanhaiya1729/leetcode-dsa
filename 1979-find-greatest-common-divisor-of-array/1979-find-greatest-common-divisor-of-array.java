class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int a=nums[0];
        int b=nums[0];
        for(int x:nums){
            if(x<a){
                a=x;
            }
            if(x>b){
                b=x;
            }
        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;



        
    }
}