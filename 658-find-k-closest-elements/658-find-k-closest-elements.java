class Solution {
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->b[0]-a[0]);
        
        for(int i = 0 ; i<arr.length ; i++){
            
            if(q.size()<k){
                q.add(new int[]{Math.abs(x-arr[i]) , arr[i]});
            }else if(q.peek()[0]>Math.abs(x-arr[i]) || (q.peek()[0] == Math.abs(x-arr[i]) && q.peek()[1]>arr[i] )){
                q.poll();
                q.add(new int[]{Math.abs(x-arr[i]) , arr[i]});
            }
            
        }
        
        while(q.isEmpty()==false){
            list.add(q.poll()[1]);
        }
        
        Collections.sort(list);
        return list;
    }
}