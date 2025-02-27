package org.example.Array.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,4,5,6};
        int nums2[] = {3,4,5,7};

        //1,2,3,4,5,6,7
System.out.println(union(nums1,nums2));

    }

    public static ArrayList<Integer> union(int nums1[], int nums2[]){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }

        list.addAll(set);
        return list;
    }
}
