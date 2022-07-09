class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> set=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            set.put(s.substring(i,i+10),set.getOrDefault(s.substring(i,i+10),0)+1);
        }
        
        List<String> ans=new ArrayList<String>();
        for(String st:set.keySet()){
            if(set.get(st)>1){
                ans.add(st);
            }
        }
        return ans;
    }
}