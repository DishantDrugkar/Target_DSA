package org.example.Leetcode_500;

public class Leetcode_53_Maximum_Subarray {
    public static void main(String[] args) {
        int nums[] = {3,-4,5,4,-1,7,-8};
        System.out.println(maxSubarray(nums));

    }
    public static int maxSubarray(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ;i<nums.length; i++){
            currSum = currSum + nums[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
