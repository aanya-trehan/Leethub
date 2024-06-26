class Solution {
    
    //NAIVE
    public void setZeroesBrute(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (matrix[i][j]==0){
                    for(int r=0;r<cols;r++){
                        if(matrix[i][r]!=0){
                            matrix[i][r]=-1;
                        }
                    }
                    for(int r=0;r<matrix.length;r++){
                        if(matrix[r][j]!=0){
                            matrix[r][j]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    if (matrix[i][j]==-1){
                        matrix[i][j]=0;
                    }
        }
    }
  }   
    
    //BETTER
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] dummyrow=new int[rows];
        int[] dummycol=new int[cols];
        Arrays.fill(dummyrow,-1);
        Arrays.fill(dummycol,-1);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (matrix[i][j]==0){
                    dummyrow[i]=0;
                    dummycol[j]=0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dummycol[j]==0 | dummyrow[i]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
    
    //BEST
     public void setZeroesBest(int[][] matrix) {
        int col1=1;
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                col1=0;
            }
            for(int j=1;j<cols;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;   
                }
    
            } 
        }
         
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=1;j--){
                if(matrix[i][0]==0 | matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if (col1==0){
                matrix[i][0]=0;
            }
        }
     }
}
        