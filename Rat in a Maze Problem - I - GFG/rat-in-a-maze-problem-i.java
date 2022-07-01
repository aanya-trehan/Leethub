// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
       int[][] vis=new int[n][n];
       ArrayList<String> ans= new ArrayList<String> ();
       for(int[] i:vis){
           Arrays.fill(i,0);
       }
       int[] di={1,0,0,-1};
       int[] dj={0,-1,1,0};
       if(m[0][0]==1) solve(0,0,m,vis,di,dj,ans,"",n);
       return ans;
    }
    
    private static void solve(int i,int j,int[][] m,int[][] vis, int[] di,int[] dj,ArrayList<String> ans,String ds,int n){
        if(i==n-1 && j==n-1){
            ans.add(ds);
            return;
        }
        
        String dir="DLRU";
        for(int ind=0;ind<4;ind++){
            int nexti=i+di[ind];
            int nextj=j+dj[ind];
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<n && vis[nexti][nextj]==0 && m[nexti][nextj]==1){
                vis[i][j]=1;
                solve(nexti,nextj,m,vis,di,dj,ans,ds+dir.charAt(ind),n);
                vis[i][j]=0;
            }
        }
    }
}