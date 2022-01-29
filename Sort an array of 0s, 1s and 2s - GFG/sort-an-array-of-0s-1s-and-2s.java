// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int zcount=0;
        int ocount=0;
        int tcount=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zcount++;
            }
            else if(a[i]==1){
                ocount++;
            }
            else if (a[i]==2){
                tcount++;
            }
        }
        int index=0;
        while(zcount>0){
            a[index]=0;
            index++;
            zcount--;
        }
        while(ocount>0){
            a[index]=1;
            index++;
            ocount--;
        }
        while(tcount>0){
            a[index]=2;
            index++;
            tcount--;
        }
        
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends