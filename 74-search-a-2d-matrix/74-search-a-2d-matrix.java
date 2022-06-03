class Solution {
    public boolean searchMatrix1(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int i=0;
        int j=c-1;
        while(i<r && j>=0){
            if(target<matrix[i][j]){
                j--;
            }
            else if(target>matrix[i][j]){
                i++;
            }
            else if(target==matrix[i][j]){
                return true;
            }
        }
        return false;
        
    }
    //TC- O(n+m)
    
    
    //Using binary search log(N+M)
     public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix.length==0){
             return false;
         }
         int r=matrix.length;
         int c=matrix[0].length;
         int l=0;
         int h=(r*c)-1;
         while(l<=h){
             int m=l+(h-l)/2;
             int cmpr=matrix[m/c][m%c];
             if(target==cmpr){
                 return true;
             }
             else if(target<cmpr){
                 h=m-1;
             }
             else if(target>cmpr){
                 l=m+1;
             }
         }
         return false;
     }
    
   
}