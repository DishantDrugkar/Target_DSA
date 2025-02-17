package org.example.Leetcode_500;

public class Leetcode_1295_Find_Even_Number_Digits {
    public static void main(String[] args) {
        int nums[] = {12,2,345,1295};
        System.out.println(countEven(nums));
    }
    public static int countEven(int nums[]){
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int digit = 0;
            while(nums[i] > 0){
                digit++;
                nums[i] /= 10;
            }
            if(digit % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}
