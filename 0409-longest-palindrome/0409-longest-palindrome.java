class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
    
        int sum=0;
        boolean odd=false;
        for(int val:map.values()){
            if(val%2==0){
                sum+=val;
            }else{
                sum+=val-1;
                odd=true;
            }

        }
        if(odd){
            sum++;
        }
        return sum;
        
    }
}