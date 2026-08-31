class Solution {
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int size=3;
        int left=0;
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            if(right-left+1 > size){
            char ch=s.charAt(left);
             map.put(ch,map.get(ch)-1);
             if(map.get(ch)==0){
                map.remove(ch);
             }
             left++;

            }

            if(right-left+1 == size){
                if(map.size()==3){
                    count++;

                }

        }
        
        
    }
    return count;
}
}