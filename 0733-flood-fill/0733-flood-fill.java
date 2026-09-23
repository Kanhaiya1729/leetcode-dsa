class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     int original=image[sr][sc];
     if(original==color){
        return image;
     }
      dfs(image,sr,sc,original,color);
        return image;
}
 public void dfs(int image[][],int sr,int sc,int original,int color){
      int m=image.length;
       int n=image[0].length;
       if(sr>=m || sr<0 || sc>=n || sc<0){
        return ;

       }
       if(image[sr][sc]!=original){
        return ;
       }
       image[sr][sc]=color;
       
      dfs(image, sr-1,sc,original,color);
      dfs(image, sr+1,sc,original,color);
        dfs(image, sr,sc-1,original,color);
        dfs(image, sr,sc+1,original,color);
        
    }

}
