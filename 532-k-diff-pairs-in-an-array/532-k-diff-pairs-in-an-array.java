class Solution {
    public int findPairs(int[] nums, int k) {
        //O(n) time and space complexity
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int counter = 0;
        for(int i : map.keySet()){
            if(k>0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
            {
              counter++;  
            } 
        }
        return counter;
    }
}