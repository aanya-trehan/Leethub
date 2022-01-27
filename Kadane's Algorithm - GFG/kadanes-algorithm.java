// { Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        int max=Integer.MIN_VALUE;
        int maxsum=0;
        int currentsum=0;
        
        
        for(int i=0;i<n;i++){
            currentsum+=arr[i];
            
            if(currentsum<0){
                currentsum=0;
            }
            
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
            
            
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        if(max<0){
                return max;
            }
        else{
                return maxsum;
            }
        
    }
    
}

