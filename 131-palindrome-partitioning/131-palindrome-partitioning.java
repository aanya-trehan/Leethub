class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        func(0,s,ans,new ArrayList<String>());
        return ans;
    }
    
    private void func(int index,String s,List<List<String>> ans, ArrayList<String> ds){
        if(index==s.length()){
            ans.add(new ArrayList<String>(ds));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                func(i+1,s,ans,ds); 
                ds.remove(ds.size()-1);
            }
        }
    }
    
    boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}