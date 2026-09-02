class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int prefix[]=new int[n+1];
        prefix[0]=0;
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+gain[i];
        }
        int highest=Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            highest=Math.max(highest,prefix[i]);

        }
        return highest;


        
    }
}