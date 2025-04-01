package Faltu;

public class SecondLargest {
    public static void main(String[] args) {
        int nums[] = {1,2,4,5,6,8,9,4,3,4,9,7};
        System.out.println("Largest Element : " + largest(nums));
        System.out.println("Second Largest : " + secondLargest(nums));
    }
    public static int largest(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];

            }
        }
        return max;
    }
    public static int secondLargest(int nums[]){
        int max = largest(nums);
        for(int i=0; i<nums.length;i++){
            if(nums[i] == max){
                nums[i] = -1;
            }
        }
        int secMax = largest(nums);
        return secMax;
    }
}
