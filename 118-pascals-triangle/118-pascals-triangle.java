class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); 
        List<Integer> prev= new ArrayList<>();
        List<Integer> curr_row;
        
        for(int i=0;i<numRows;i++){
            curr_row= new ArrayList<>();
            curr_row.add(1);
            for(int j=1;j<i+1;j++){
                if (i==j | j==0){
                    curr_row.add(1);
                }
                else{
                    curr_row.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=curr_row;
            ans.add(curr_row);
        }
        return ans;
    }
}