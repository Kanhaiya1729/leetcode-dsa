class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes){
        int n=customers.length;
        int size=minutes;
        int left=0;
        int WindowSum=0;
        int sum=0;
        int max=0;
        for(int right=0;right<n;right++){
            if(grumpy[right]==1){
                WindowSum+=customers[right];
            }
            if(grumpy[right]==0){
                sum+=customers[right];
            }


            if(right-left+1 > size){
                if(grumpy[left]==1){
                    WindowSum-=customers[left];

                }
                   left++;
            }
            if(right-left+1==size ){
                max=Math.max(max,WindowSum);

            }


        }
        return max+sum;
        

    
 
    }
}