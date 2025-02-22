package org.example.Leetcode_500;

public class Leetcode_75_SortColors {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,0,1,1,2,0,1,2,0};
        sortColors(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void sortColors(int nums[]){
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high ){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int nums[], int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
