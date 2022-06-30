class Solution {
    //optimal sol
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recurpermute(0,nums,ans);
        return ans;
    }
    
    private void recurpermute(int ind,int[] nums,List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            recurpermute(ind+1,nums,ans);
             swap(ind,i,nums);
        }
    }
    
    private void swap(int ind1,int ind2,int[] nums){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
    
    
    
    
    
    // alternate sol
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        List<Integer> ds=new ArrayList<>();
        sol(nums,ans,freq,ds);
        return ans;
    }
    
    private void sol(int[] nums,List<List<Integer>> ans,boolean[] freq, List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                sol(nums,ans,freq,ds);
                ds.remove(ds.size()-1);
                sol(nums,ans,freq,ds);
                freq[i]=false;
            }
        }
    }
}