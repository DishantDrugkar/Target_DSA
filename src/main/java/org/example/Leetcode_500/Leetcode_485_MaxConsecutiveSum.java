package org.example.Leetcode_500;

public class Leetcode_485_MaxConsecutiveSum {
    public static void main(String[] args) {
        int nums[] = {1,0,0,1,1,1,0,0};
        System.out.println(counts(nums));
    }
    public static int counts(int nums[]){
        int count = 0;
        int maxCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}
