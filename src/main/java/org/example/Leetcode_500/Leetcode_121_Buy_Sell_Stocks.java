package org.example.Leetcode_500;

public class Leetcode_121_Buy_Sell_Stocks {
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        System.out.println(stock(nums));
    }
    public static int stock(int nums[]){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<nums.length; i++){
            minPrice = Math.min(minPrice, nums[i]);
            maxProfit = Math.max(maxProfit,nums[i]-minPrice);
        }
        return maxProfit;
    }
}
