class Solution {
    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        return mergeSort(nums,0,nums.length-1,temp);
    }
    
    public int mergeSort(int[] nums, int low, int high, int[] temp) {
        int count = 0;
        if(low<high)
        {
            int mid = (low+high)/2;
            count += mergeSort(nums,low,mid,temp);
            count += mergeSort(nums,mid+1,high,temp);
            count += merge(nums,low,mid+1,high,temp);
        }
        return count;
    }
    
    // 1 2 3    1 3
    public int merge(int[] nums, int low, int mid, int high, int[] temp) {
        int count = 0;
        int j = mid;
        for(int i=low; i<mid; i++)
        {
            while((j<=high) && (nums[i]>2*(long)nums[j])){
                j++;
            }
            count += j-mid;
        }
        
        int i = low;
        j = mid;
        int k = low;
        while((i<=mid-1) && (j<=high))
        {
            if(nums[i]<=nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }
        
        while(i<=mid-1)
            temp[k++] = nums[i++];
        
        while(j<=high)
            temp[k++] = nums[j++];
        
        for(i = low; i<=high; i++)
            nums[i] = temp[i];
        
        return count;
    }
}