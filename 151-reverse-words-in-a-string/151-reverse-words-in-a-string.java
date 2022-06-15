class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+"," ").trim();
        String ans="";
        String[] str=s.split(" ");
        for(int i=0;i<str.length/2;i++){
            String temp=str[i];
            str[i]=str[str.length-i-1];
            str[str.length-i-1]=temp;
        }
        return String.join(" ",str);
    }
    
}
