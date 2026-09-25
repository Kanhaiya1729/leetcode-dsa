class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        int degree[]=new int[n+2];
        for(int[] list: edges){
            int u=list[0];
            int v=list[1];  
            degree[u]++;
            degree[v]++;
           
        }
        for(int i=1;i<n+2;i++){
            if(degree[i]==n && degree[i]==n){
                return i;
            }
        }
        return -1;
    }
}