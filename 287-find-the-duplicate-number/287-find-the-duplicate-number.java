class Solution {
    
//naive
//Approach: Sort the array. After that, if there is any duplicate number they will be adjacent. So we simply have to check if arr[i]==arr[i+1] and if it is true,arr[i] is the duplicate number.
// TC-O(Nlogn + N) Nlogn for sort, N for linear search
//Space-O(1)
    
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                return nums[i];
            }
        }
    return 0;
    }
    
    
//better
//Approach: Take a frequency array of size N+1 and initialize it to 0. Now traverse through the array and if the frequency of the element is 0 increase it by 1, else if the frequency is not 0 then that element is the required answer.
// TC- O(N)
//Space Complexity: O(N), as we are using extra space for frequency array.

    public int findDuplicateBetter(int[] nums) {
        int[] arr= new int[nums.length];
         for(int i:nums){
             if (arr[i]==1){
                 return i;
             }
             else{
                 arr[i]++;
             }
         }
         return 0;
    }
   
//Optimal
//TC: O(N). Since we traversed through the array only once.
//Space complexity: O(1).    
    
    public int findDuplicateBest(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        slow=nums[slow];
        fast=nums[nums[fast]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        fast=nums[0];
        while(fast!=slow){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    
}