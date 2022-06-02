class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int x:map.keySet()){
            if (map.get(x)>(nums.length/3)){
                ans.add(x);
            }
        }
        return ans;
    }
}