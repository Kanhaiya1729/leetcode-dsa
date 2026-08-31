class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int max=0;
        int count=0;
        String vowel="aeiou";
        for(int right=0;right<s.length();right++ ){
           if(vowel.indexOf(s.charAt(right))!=-1){
                    count++;
                }
            if(right-left+1 > k){
                if(vowel.indexOf(s.charAt(left))!=-1){
                    count--;
                }
                left++;
            }
            if(right-left+1 == k){
                max=Math.max(max,count);
                
   
            }

        }
        return max;
        
    }
}