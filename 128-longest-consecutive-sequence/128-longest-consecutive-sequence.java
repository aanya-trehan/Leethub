class Solution {
    public int longestConsecutive1(int[] nums) {
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
    
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set= new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        int mcount=0;
        for(int i:nums){
            if(!set.contains(i-1)){
                int curr=i;
                int count=1;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                mcount=Math.max(count,mcount);
            }
        }
        return mcount;
    }
}