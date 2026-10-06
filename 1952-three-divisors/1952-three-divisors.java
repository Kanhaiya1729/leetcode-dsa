class Solution {
    public boolean isThree(int n) {
        int root= (int)Math.sqrt(n);
        if(root*root!=n){
            return false;
        }
        int count=0;
        for(int i=1;i<=root;i++){
            if(root%i==0){
                count++;
            }
        }
        if(count!=2){
            return false;
        }
        return true;
     
}
}