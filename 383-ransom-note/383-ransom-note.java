class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] m = magazine.toCharArray();
        char[] r = ransomNote.toCharArray();
        int[] map = new int[128];
        for(char c: m){
            map[c]++;    
        }
        for(char c: r){
            if(map[c]<1){
                return false;
            }
            map[c]--;
        }
        return true;
    }
}