package org.example.Leetcode_500;

public class Leetcode_268_MissingNumber {
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int nums[]){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int actualSum = nums.length * (nums.length + 1) / 2;
        int missingNum = actualSum - sum;
        return missingNum;
    }
}
