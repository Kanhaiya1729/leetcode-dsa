class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                   sum+=mat[i][j];
                }

            }
        }
        int i=0;
        while(i<n){
         sum+=mat[i][n-i-1];
         i++;
        }
        if(n%2!=0){
        int mid=(0+(n-1))/2;
        sum-=mat[mid][mid];
        return sum;
        }else{
             return sum;
        }
        
    }
}