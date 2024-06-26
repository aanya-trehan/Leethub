class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int prev[]=new int[Math.max(m,n)+1];
        int cur[]=new int[Math.max(m,n)+1];
        for(int ind1=1;ind1<=n;ind1++){
            for(int ind2=1;ind2<=m;ind2++){
                if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
                    cur[ind2] = 1 + prev[ind2-1];
                else
                    cur[ind2] = 0 + Math.max(prev[ind2],cur[ind2-1]);
            }
            prev=(int[])(cur.clone());
        }

        return prev[m];
    }
}