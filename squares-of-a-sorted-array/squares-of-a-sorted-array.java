class Solution {
    public int[] sortedSquares(int[] nums) {
        int right=nums.length-1;
        int left=0;
        int[] arr=new int[nums.length];
        for(int i=nums.length-1;i>-1;i--)
        {
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                arr[i]=nums[right]*nums[right];
                right--;
            }
            else{
                arr[i]=nums[left]*nums[left];
                left++;
            }
        }
        return arr;
    }
}