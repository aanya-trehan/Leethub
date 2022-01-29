class Solution {
    public boolean isValid(String s) {
        
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


