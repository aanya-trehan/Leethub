class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;
        return subsetsum(nums.length,sum/2,nums);
    }
    
    public boolean subsetsum(int n, int k,int[] arr){
        boolean[] prev=new boolean[k+1];
        boolean[] cur=new boolean[k+1];
        prev[0]=true;
        if(arr[0]<=k) prev[arr[0]]=true;
        for(int ind=1;ind<n;ind++){
            cur=new boolean[k+1];
            cur[0] = true;
            for(int target=1; target<=k; target++){
                boolean notTaken = prev[target];
                boolean taken = false;
                    if(arr[ind]<=target)
                        taken = prev[target-arr[ind]];

                cur[target]= notTaken||taken;
        }
        prev=cur;
      
        }
    
    return prev[k];
    }
}