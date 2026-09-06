class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int s=1;
        int e=x;
        int ans=0;
          while(s<=e){
            long mid= s+(e-s)/2;
            if(mid*mid<=x){
                ans=(int)mid;
                s=(int)mid+1;
            }else{
                e=(int)mid-1;
            }      
    }
     return ans;
}
}