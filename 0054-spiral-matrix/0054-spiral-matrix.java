class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans=new ArrayList<>();
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
        for(int i=sc;i<=ec;i++){
             ans.add(matrix[sr][i]);

        }
         for(int i=sr+1;i<=er;i++){
             ans.add(matrix[i][ec]);

        }
        if(sr<er){        
          for(int i=ec-1;i>=sc;i--){
             ans.add(matrix[er][i]);

        }
        }
        if(sc<ec){
        
         for(int i=er-1;i>sr;i--){
             ans.add(matrix[i][sc]);

        }
        }
         sr++;
        er--;
        sc++;
        ec--;
 }
 return ans;
        
    }
}