package org.example.Leetcode_500;

import java.util.Arrays;

public class Leetcode_1929_ConcatenationOfArray {
    public static void main(String[] args) {
        int nums[] = {1,3,2,1};
      int ans[] = concatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] concatenation(int nums[]){
        int n = nums.length;
        int ans[] = new int[2 * n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
