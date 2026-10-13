class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
       for(int[] row : dp){
        Arrays.fill(row,-1);
       }
        return path(grid,0,0,dp);
    }
    public int path(int[][]grid,int i,int j,int dp[][]){
        int n=grid.length;
        int m=grid[0].length;

         if(i<0 ||  i>=n ||  j<0 || j>=m ){
            return Integer.MAX_VALUE;
        }
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
          if(dp[i][j]!=-1){
            return dp[i][j];
          }
           
           int right = path(grid,i,j+1,dp);
           int down  = path(grid,i+1,j,dp);

          dp[i][j]= grid[i][j]+Math.min(right,down);
           return dp[i][j];
  
          

        }

    }
