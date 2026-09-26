class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        boolean [][]vis=new boolean[m][n];
        Queue<int[]>q=new LinkedList<>();
          int fresh=0;

          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});
                    vis[i][j]=true;
                }
                 if(grid[i][j]==1){
                    fresh++;
                }
            }
          }
  
          while(!q.isEmpty()){
            int curr[]=q.remove();
            int i=curr[0];
            int j=curr[1];
            int t=curr[2];
            ans=Math.max(ans,t);

            if(i-1>=0 && !vis[i-1][j] && grid[i-1][j]==1){
                vis[i-1][j]=true;
                fresh--;
                q.add(new int[]{i-1,j,t+1});
            }
            if(i+1<m && !vis[i+1][j] && grid[i+1][j]==1){
                vis[i+1][j]=true;
                fresh--;
                q.add(new int[]{i+1,j,t+1});
            }
            if(j-1>=0 && !vis[i][j-1] && grid[i][j-1]==1){
                vis[i][j-1]=true;
                fresh--;
                q.add(new int[]{i,j-1,t+1});
            }
            if(j+1<n && !vis[i][j+1] && grid[i][j+1]==1){
                vis[i][j+1]=true;
                fresh--;
                q.add(new int[]{i,j+1,t+1});
            }
           
          }
          return fresh==0 ? ans: -1;

        
    }
}