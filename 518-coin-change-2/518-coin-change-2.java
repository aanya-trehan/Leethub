class Solution {
    public int change(int T, int[] coins) {
        long dp[][]=new long[coins.length][T+1];
        for(long row[]: dp)
        Arrays.fill(row,-1);
        return countWaysToMakeChangeUtil(coins,coins.length-1,T,dp);
    }
     public int countWaysToMakeChangeUtil(int[] arr, int ind, int T,long[][] dp){
        if(ind == 0){
        if(T%arr[0]==0)
        return 1;
        else
        return 0;
    }
    
    if(dp[ind][T]!=-1)
        return (int)dp[ind][T];
        
    long notTaken = countWaysToMakeChangeUtil(arr,ind-1,T,dp);
    
    long taken = 0;
    if(arr[ind] <= T)
        taken = countWaysToMakeChangeUtil(arr,ind,T-arr[ind],dp);
        dp[ind][T] = notTaken + taken;
    return (int)dp[ind][T];
     }
}