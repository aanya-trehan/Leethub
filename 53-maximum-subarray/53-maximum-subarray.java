class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int sum1=0;
        int maxsum=0;
        
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            
            if(sum1<0){
                sum1=0;
            }
            
            maxsum=Math.max(sum1,maxsum);
            
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        if (nums[max]<0){
            return nums[max];
        }
        else{
            return maxsum;
        }
    }
}