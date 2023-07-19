package com.java.dolmayan.leetcode.EasyCollection;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int arr1[] = {0,1,0,3,12};
        int arr2[] = {1,0,1};

        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void moveZeroes(int[] nums) {
        int i =0;

           for(int j = 1; j< nums.length; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                } else if (nums[i] !=0) {
                    i++;
                }
            }
    }
}
