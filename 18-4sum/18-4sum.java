class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> ans= new ArrayList<List<Integer>>();
        if(nums.length<=3){
            return ans;
        }
        int n=nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int left=j+1;
                int right=n-1;
                int target2=target-nums[i]-nums[j];
                
                while(left<right)
                {
                    int sum2=nums[left]+nums[right];
                    if(target2>sum2){
                        left++;
                    }
                    else if(target2<sum2){
                        right--;
                    }
                    else{
                        List<Integer> temp= new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        ans.add(temp);
                        
                        while(left<right && nums[left]==temp.get(2)){
                            left++;
                        }
                        while(left<right && nums[right]==temp.get(3)){
                            right--;
                        }
                }
                
                }
                while(j+1<n && nums[j]==nums[j+1])
                {
                    j++;
                }
            }
            
            while(i+1<n && nums[i]==nums[i+1])
            {
                    i++;
            }
            
        }
        return ans;
    }
    
    
    
}