class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        if(nums.length==0){
            return 0;
        }
        int count=1;
        int mcount=1;
        Arrays.sort(nums);
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num+1){
                count++;
                mcount=Math.max(mcount,count);
                num=nums[i];
            }
            else if(nums[i]==num){
                 num=nums[i];
            }
            else{
                mcount=Math.max(mcount,count);
                count=1;
                num=nums[i];
                
            }
        }
        return mcount;
    }
}