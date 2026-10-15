class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(num!=0){
        int lastdigit =num%10;
         rev=rev*10+lastdigit;
         num=num/10;
        }
        if(rev==x){
            return true;
        }else{
            return false;
        }
        
    }
}