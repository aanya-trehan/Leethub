class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int mat_row=mat.length;
        int mat_col=mat[0].length;
        int matrix_size=mat_row* mat_col;
        int reshape_size=r*c;
        if((mat_col==c && mat_row==r) || matrix_size!=reshape_size  ){
            return mat;
        }
        int r_index=0;
        int c_index=0;
        int[][] new_mat=new int[r][c];
        for(int i=0;i<mat_row;i++){
            for(int j=0;j<mat_col;j++){
                new_mat[r_index][c_index]=mat[i][j];
                if(c_index==c-1){
                    c_index=0;
                    r_index++;
                }
                else{
                    c_index++;
                }
            }
        }
        return new_mat;
    }
}