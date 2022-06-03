class Solution {
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] narr=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                narr[0]=map.get(target - nums[i]); 
                narr[1]=i;
            } else {
                map.put(nums[i], i);
            }
        }
        return narr;
    }
    
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}