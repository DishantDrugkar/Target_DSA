package org.example.Leetcode_500;

import java.util.Arrays;

public class Leetcode_2_Two_Sum {
    public static void main(String[] args) {
        int nums[] = {6,7,8,24,56,6};
        int target = 30;
        int result[] = sum(nums, target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] sum(int nums[], int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
