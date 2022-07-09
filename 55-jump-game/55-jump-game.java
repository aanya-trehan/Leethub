class Solution {
    public boolean canJump(int[] nums) {
        int reachable=0;
        for(int i=0;i<nums.length && i<=reachable ; i++){
            if(i==nums.length-1) return true;
            reachable=Math.max(reachable,i+nums[i]);
        }
        return false;
    }
}