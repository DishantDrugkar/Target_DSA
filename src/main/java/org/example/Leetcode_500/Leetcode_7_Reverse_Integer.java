package org.example.Leetcode_500;

public class Leetcode_7_Reverse_Integer {
    public static void main(String[] args) {
        int num = -123;
        System.out.println(reverse(num));
    }
    public static int reverse(int num){
        long reverse = 0;
        while(num != 0){
            int lastdigit = num % 10;
            reverse =reverse * 10 + lastdigit;
            num /= 10;
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int) reverse;
    }
}
