class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        int Indegree[]=new int[n+2];
        int Outdegree[]=new int[n+2];

        for(int[] list: edges){
            int u=list[0];
            int v=list[1];  

            Outdegree[u]++;
            Indegree[v]++;
            Outdegree[v]++;
            Indegree[u]++;
        }
        for(int i=1;i<=n+1;i++){
            if(Indegree[i]==n && Outdegree[i]==n){
                return i;
            }
        }
        return -1;
    }
}