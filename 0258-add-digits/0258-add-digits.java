class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        int n=num;
        while(n>=10){
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            n=n/10;
            if(num==0){
                return num;
            }
            sum+=lastdigit;
        }
        n=sum;
        }
        return n;
        
    }
}