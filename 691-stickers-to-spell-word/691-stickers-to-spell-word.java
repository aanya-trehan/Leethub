class Solution {
    
    
    public int minStickers(String[] stickers, String target) {

        int[] dp = new int[(1 << target.length()) + 1];
        Arrays.fill(dp, -1);
        int ans = helper(stickers, target, 0, dp);
        if(ans==Integer.MAX_VALUE || ans<0){
            return -1;
        }
        else{
            return ans;
        }
    }
    
int helper(String[] stickers, String target, int prev, int dp[]) {
        if(prev == ((1 << target.length()) - 1)) {
            return 0;
        }
        
        else if(dp[prev] != -1) {
            return dp[prev];
        }
        else {
            int ans = Integer.MAX_VALUE;
            int i=0;
            char a='a';
            while(i<stickers.length){
                int cur = prev;
                int[] f = new int[26];
                for(int j=0;j<stickers[i].length();j++){
                    f[stickers[i].charAt(j) - a]++;
                }
                int k=0;
                while(k<target.length()){
                    if(f[target.charAt(k) - a] > 0 && (cur & (1 << k)) == 0) {
                        cur |= (1<< k);
                        f[target.charAt(k) - 'a']--;
                    }
                    k++;
                }
                if(cur != prev) {
                    ans = Math.min(ans, helper(stickers, target, cur, dp) + 1);
                }
                i=i+1;
            }
        return dp[prev] = ans;
}
    }
    
}