class Solution {
    public int uniquePaths(int m, int n) {
        // return helper(0,0,n,m); recursive solution
        int[][] dp=new int[m][n];
        for(int[] l:dp){
            Arrays.fill(l,-1);
        }
        //return helperdp(0,0,n,m,dp); dp
        return comb(m,n);
    }
    
    public int helper(int i, int j, int m, int n){
        if(i>m-1 || j>n-1){return 0;}
        if(i==m-1 && j==n-1){ return 1;}
        return helper(i,j+1,m,n)+helper(i+1,j,m,n);
    }
    
    public int helperdp(int i, int j, int m, int n, int[][] dp){
        if(i>m-1 || j>n-1){return 0;}
        if(i==m-1 && j==n-1){ return 1;}
        if(dp[i][j]!=-1){return dp[i][j];}
        return dp[i][j]=helper(i,j+1,m,n)+helper(i+1,j,m,n);
    }
    
    public int comb(int m,int n){
        int N=m+n-2;
        int r=Math.min(m,n)-1;
        double res = 1;
        // for(int i=1;i<=r;i++){
        //     //ans=(ans*(N-i))/(i+1);
        //     res = res * (N - r + i) / i;
        // }
        for(int i=0;i<r;i++){
            res=res*(N-i)/(i+1);
        }
        return (int)res;
    }
}