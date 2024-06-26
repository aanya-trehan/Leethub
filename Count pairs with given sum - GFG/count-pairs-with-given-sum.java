// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++) {
            if(map.containsKey(k-arr[i]))
               count+=map.get(k-arr[i]);
            if(map.containsKey(arr[i])){
                int c=map.get(arr[i]);
                map.put(arr[i],c+1);
            }
            else{
            map.put(arr[i],1);
            }
        }
        return count;
    }
}
