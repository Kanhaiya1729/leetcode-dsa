class Solution {
    public String reverseVowels(String s) {
        char  arr[]=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        String vowel="aAeEiIoOuU";
      while(start<end){
        if(vowel.indexOf(arr[start])==-1){
            start++;
        }else if(vowel.indexOf(arr[end])==-1){
            end--;
      }else{
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;

      }


      
    }
    return new String(arr);

}
}