class Solution {
    public int minFallingPathSum(int[][] a) {
        int min = Integer.MAX_VALUE;
        int m = a.length;
        int n = a[0].length;
        
        int[] dp=new int[n];
        for(int j = 0; j<n; j++) dp[j] = a[0][j];
        for(int i = 1; i<m; i++){
            int[] curr=new int[n];
            for(int j =0; j<n; j++){
                int left = a[i][j];
                if(j>0) left += dp[j-1];
                else left += (int)Math.pow(10,9);
                
                int up = a[i][j] + dp[j];
                
                int right = a[i][j];
                if(j<a[0].length-1) right += dp[j+1];
                else right = (int)Math.pow(10,9);
                
                curr[j] = Math.min(left,Math.min(up,right));
            }
            dp=curr;
        }
        
        for(int j = 0; j<n; j++){
            min = Math.min(min,dp[j]);
        }
        return min;
    }
}