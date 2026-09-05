class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int expected[]=new int[n];
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
        }

        Arrays.sort(expected);
        int count=0;
        int i=0;
        int j=0;
        while(i<n && j<n){
            if(expected[i]!=heights[j]){
                count++;
            }
            i++;
            j++;
        }
        return count; 
    }
}