class Solution {
    public List<Integer> majorityElementBetter(int[] nums) {
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
    
    public List<Integer> majorityElement(int[] nums){
        int num1=-1;
        int num2=-1;
        int count1=0;
        int count2=0;
        
        List<Integer> ans= new ArrayList<>();
            
        for(int num:nums){
            if(num==num1){
                count1++;
            }
            else if (num==num2){
                count2++;
            }
            else if(count1==0){
                num1=num;
                count1++;
            }
            else if(count2==0){
                num2=num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==num1){
                count1++;
            }
            else if (num==num2){
                count2++;
            }
        }
        
        if(count1>(nums.length/3)){
            ans.add(num1);
        }
        if(count2>(nums.length/3)){
            ans.add(num2);
        }
    return ans;
    }
}