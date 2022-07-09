class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int lens=s.length();
        
        for (int i=0; i<lens; i++){
            char checkChar = s.charAt(i);
            
            // case 1 - character is a number 
            if(Character.isDigit(checkChar)){
                 int num=checkChar-'0';
                 while(i+1<lens && Character.isDigit(s.charAt(i+1))){
                     num=num*10+ (s.charAt(i+1)-'0');
                     i++;
                 }
                 numStack.push(num);
             }
            else if(checkChar=='['){
                 strStack.push(sb.toString());
                 sb=new StringBuilder();
             }
            else if(checkChar==']'){
                 int repeat=numStack.pop();
                 StringBuilder temp=new StringBuilder(strStack.pop());
                 while(repeat>0){
                     temp.append(sb);
                     repeat--;
                 }
                 sb=temp;
             }
             else{
                 sb.append(checkChar);
             }
        }
        return sb.toString();
    }
    
//     public String decodeString1(String s) {
//          Stack<Integer> numStack = new Stack<>();
//          Stack<String> strStack = new Stack<>();
//          StringBuilder sb = new StringBuilder();
//          int lens=s.length();
//          for(int i=0;i<len;i++){
//              int ch=s.charAt(i);
             
//              //case 1 digit
//              if(Character.isDigit(ch)){
//                  int num=ch-'0';
//                  while(i+1<lens && Character.isDigit(s.charAt(i+1))){
//                      num=num*10+ (s.charAt(i+1)-'0');
//                      i++;
//                  }
//                  numStack.push(num);
//              }
//              else if(ch=='['){
//                  strStack.push(sb.toString());
//                  sb=new StringBuilder();
//              }
//              else if(ch==']'){
//                  int repeat=numStack.pop();
//                  StringBuilder temp=new StringBuilder(strStack.pop());
//                  while(repeat>0){
//                      temp.append(sb);
//                      repeat--;
//                  }
//                  sb=temp;
//              }
//              else{
//                  sb.append(ch);
//              }
             
//     }
//         return sb.toString();
// }
}