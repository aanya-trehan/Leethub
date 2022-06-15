class Solution {
    public int trap(int[] height) {
        int ans=0;
        int right=height.length-1;
        int left=0;
        int maxright=0;
        int maxleft=0;
        while(left<=right){
            if(height[left]<=height[right]){
                maxleft=Math.max(maxleft,height[left]);
                ans+=maxleft-height[left];
                left++;
            }
            else{
                maxright=Math.max(maxright,height[right]);
                ans+=maxright-height[right];
                right--;
            }
        }
        return ans;
    }
}