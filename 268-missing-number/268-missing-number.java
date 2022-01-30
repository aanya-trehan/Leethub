class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        int maxi=0;
        for(int i:nums){
            maxi=Math.max(maxi,i);
            set.add(i);
        }
        int i=0;
        for(i=0;i<maxi;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return i+1;
    }
}