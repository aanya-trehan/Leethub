class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] curr=s.toCharArray();
            Arrays.sort(curr);
            String sortedcur=new String(curr);
            if(!map.containsKey(sortedcur)){
                map.put(sortedcur,new ArrayList<String>());
            }
            map.get(sortedcur).add(s);
        }
        return new ArrayList<>(map.values());
    }
}