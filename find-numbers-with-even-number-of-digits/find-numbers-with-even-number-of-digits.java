class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i:nums){
            int num=i;
            int count=0;
            while(num>0){
                num=num/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
    
    
}