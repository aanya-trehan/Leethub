class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=0;
        int maxnum=nums[0];
        int currsum=0;
        
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
            
            if (currsum<0){
                currsum=0;
            }
            
            if(nums[i]>maxnum){
                maxnum=nums[i];
            }
            
            maxsum=Math.max(maxsum,currsum);
            
        }
        if(maxnum<0){
            return maxnum;
        }
        else{
            return maxsum;
        }
    }
}