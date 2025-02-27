package org.example.Leetcode_500;

public class Leetcode_2149_Rearrange_array_bySign {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-1,4,-3};
        reArrange(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static int[] reArrange(int nums[]){
        int n = nums.length;
        int res[] = new int[n];
        int posIndex = 0, negIndex = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                res[posIndex] = nums[i];
                posIndex += 2;
            }else{
                res[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return res;
    }
}
