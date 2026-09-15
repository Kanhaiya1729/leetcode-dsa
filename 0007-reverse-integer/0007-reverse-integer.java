class Solution {
    public int reverse(int x) {
        int  num=x;
        int  rev=0;
        while(num!=0){
                int lastDigit=num%10;
                num=num/10;
              if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

                rev=rev*10+lastDigit;

        }
           
    return rev;
}
}