class Solution {
    public int rob(int[] nums) {
        // remove int[] dp=new int[nums.length+1];
        // change dp[0]=nums[0];
        int prev=nums[0];
        int prev2=0;
        int curr;
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1){
                pick+=prev2;
            }
            int notpick=prev;
            curr=Math.max(pick,notpick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    
    public int robmemo(int[] nums) {
        int[] dp=new int[nums.length+1];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notpick=dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[nums.length-1];
    }
    
    
}