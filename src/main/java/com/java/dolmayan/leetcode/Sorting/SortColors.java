package com.java.dolmayan.leetcode.Sorting;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int arr[] ={2,0,2,1,1,0};

        sortColors(arr);
        System.out.println("\n*******\n" + Arrays.toString(arr));
        System.out.println("*******");
    }

    public static void sortColors(int[] nums) {
        int current;

        for(int i=0; i< nums.length; i++){
            current = i;
            for(int j = 1 + i; j < nums.length; j++){
                if (nums[j] < nums[current]) {
                    current = j;
                }
            }
                int temp = nums[current];
                nums[current] = nums [i];
                nums[i] = temp;
        }

    }


}
