class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[]=new int[m];
    
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                if(i==0 && j==0) dp[j] = grid[i][j];
                else{

                    int up = grid[i][j];
                    if(i>0) up += dp[j];
                    else up += 1000000;

                    int left = grid[i][j];
                    if(j>0) left+=dp[j-1];
                    else left += 1000000;

                    dp[j] = Math.min(up,left);
                }
            }
        }

        return dp[m-1];
    }
}