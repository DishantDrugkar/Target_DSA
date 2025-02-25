package org.example.Leetcode_500;

public class Leetcode_136_SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(single(nums));
    }
    public static int single(int nums[]){
        int unique = 0;
        for(int num : nums){
            unique = unique ^ num;
        }
        return unique;
    }
}
