// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        Stack<Character> stack=new Stack<Character>();
        
        HashMap<Character,Character> brackets=new HashMap<Character, Character>();
        
        brackets.put(')','(');
        brackets.put('}','{');
        brackets.put(']','[');
        
        for(int i=0;i<s.length();i++){
            
            if (brackets.containsKey(s.charAt(i))){
                
                if(stack.isEmpty()==false){
                    
                    char check=stack.pop();
                    
                    if (check!=brackets.get(s.charAt(i))){
                    
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
