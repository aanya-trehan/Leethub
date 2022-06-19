class Solution {
    public int climbStairs(int n) {
        // int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // dp[0]=0;
        // dp[1]=1;
        // dp[2]=2;
        // return memo(n,dp);
       //return helper(n);
        
        if(n==0){
            return 0;
        }
        if (n <= 1) {
            return 1;
        }
        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
        
    }
    
    //recursion
    public int helper(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return helper(n-1)+helper(n-2);
    }
    
    public int memo(int n,int[] dp){
        if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n]=memo(n-1,dp)+memo(n-2,dp);
            return dp[n];
        }
    }
    
    
}