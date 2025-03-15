package org.example.Leetcode_500;

public class Leetcode_31_Next_Permutation {
    public static void main(String[] args) {
        int nums[] = {1,2,3,6,5,4};
        permutation(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void swap(int nums[], int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }

    public static void reverse(int nums[], int start, int end){
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
    public static void permutation(int nums[]){
        int pivot = -1;
        int n = nums.length;

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }
}
