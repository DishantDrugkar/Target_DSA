package org.example.Leetcode_500;

public class Leetcode_9_Palindrome_Number {
    public static void main(String[] args) {
        int num = 1213;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;
        while(num > 0){
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num /= 10;
        }
        if(original == reverse){
            return true;
        }else{
            return false;
        }
    }
}
