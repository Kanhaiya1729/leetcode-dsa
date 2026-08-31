class Solution {
    public int maxVowels(String s, int k) {
        char arr[]=s.toCharArray();
        int left=0;
        int max=0;
        int count=0;
        String vowel="aeiou";
        for(int right=0;right<s.length();right++ ){
           if(vowel.indexOf(arr[right])!=-1){
                    count++;
                }
            if(right-left+1 > k){
                if(vowel.indexOf(arr[left])!=-1){
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