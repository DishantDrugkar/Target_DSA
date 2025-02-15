package org.example.Array.Easy;

public class Largest {
    public static void main(String[] args) {
        int nums[] = {10,5,10};
        System.out.println("Largest Element : " + getLargest(nums));
        System.out.println("Second Largest : " + getSecondLargest(nums));
       // System.out.println("Third Largest : " + getThirdLargest(nums));
    }
    public static int getLargest(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static int getSecondLargest(int nums[]){
       int max = getLargest(nums);
       for(int i=0; i<nums.length; i++){
           if(nums[i] == max){
               nums[i] = -1;
           }
       }
      int secMax = getLargest(nums);
       return secMax;
    }
    public static int getThirdLargest(int nums[]){
       int secmax = getSecondLargest(nums);
       for(int i=0; i<nums.length; i++){
           if(nums[i] == secmax){
               nums[i] = -1;
           }
       }
      int thirdMax = getLargest(nums);
       return thirdMax;
    }
}
