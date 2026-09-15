class Solution {
    public boolean isHappy(int n) {
    HashSet<Integer>set=new HashSet<>();
       while(n!=1){
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            sum+=lastdigit*lastdigit;
            n/=10;

        }
        n=sum;
        
       }
       return true;
        
 
    

    }
}