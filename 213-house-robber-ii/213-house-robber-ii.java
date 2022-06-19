class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(solve(nums,0,nums.length-2),solve(nums,1,nums.length-1));
    }
    
    public int solve(int[] nums, int start,int end){
        int prev2=0;
        int prev=0;
        for(int i=start;i<=end;i++){
            int pick=nums[i]+prev2;
            int notpick=0+prev;
            int curr=Math.max(pick,notpick);
            prev2=prev;
            prev=curr;
            
        }
        return prev;
    }
}