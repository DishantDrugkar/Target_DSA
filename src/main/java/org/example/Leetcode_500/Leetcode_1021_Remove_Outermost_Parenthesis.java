package org.example.Leetcode_500;

public class Leetcode_1021_Remove_Outermost_Parenthesis {
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeParenthesis(str));
    }
    public static String removeParenthesis(String str) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                if (counter > 0) {
                    sb.append(ch);
                }
                counter++;
            } else{
                counter--;
                if (counter > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
