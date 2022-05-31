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
    
     public int maxSubArray2(int[] nums) {
        int max_sum = 0;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum = sum + nums[k];
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
        }
        return max_sum;
     }
    
    public int maxSubArray3(int[] nums) {
        int max_sum = Integer.MIN_VALUE;;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i <= n - 1; i++) {
            int sum = 0;
            for (int j = i; j <= n - 1; j++) {
                    sum = sum + nums[j];
            if (sum > max_sum) {
                    max_sum = sum;
            }
        }
     }
        return max_sum;
}
}