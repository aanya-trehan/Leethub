class NumArray {
    
    int[] prefixarr;

    public NumArray(int[] nums) {
        prefixarr=new int[nums.length];
        prefixarr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixarr[i]=prefixarr[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prefixarr[right];
        }
        else{
            return prefixarr[right]-prefixarr[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */