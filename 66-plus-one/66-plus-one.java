class Solution {
   public int[] plusOne(int[] digits) {
       int carry=1;
       for(int i=digits.length-1;i>=0;i--){
           int curr=digits[i]+carry;
           if(curr>=10){
               digits[i]=curr%10;
               carry=1;
           }
           else{
               carry=0;
               digits[i]=curr;
           }
       }
       if(carry==0) return digits;
       else{
           int[] newdigits=new int[digits.length+1];
           newdigits[0]=1;
           for(int i=1;i<newdigits.length;i++){
               newdigits[i]=digits[i-1];
           }
           return newdigits;
       }
   }
}