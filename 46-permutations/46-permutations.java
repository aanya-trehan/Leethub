class Solution {
    public List<List<Integer>> permute(int[] nums) {
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