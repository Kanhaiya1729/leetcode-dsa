class Solution {
    public int divisorSubstrings(int num, int k) {
       String s=String.valueOf(num);
       int n=s.length();
       int left=0;
       int count=0;
       for(int right=0;right<n;right++){
        String sub=s.substring(left,right+1);
    
       if(right-left+1>k){
        left++;
        sub=s.substring(left,right+1);
    
       }
       if(right-left+1==k){
        int x=Integer.parseInt(sub);
        if( x!=0 && num%x==0){
            count++;
        }
       }
       }
       return count;
      
    }
}