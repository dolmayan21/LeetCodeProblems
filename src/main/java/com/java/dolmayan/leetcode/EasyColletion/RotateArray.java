package com.java.dolmayan.leetcode.EasyColletion;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] nums = {8,2,0,4,1,4,2,1,0,6,6,2};
        int k= 119;

         //(nums,k);

    }

    /*
    *       OVERHELMED haha..
    *
    *
    *
    public static void rotate(int[] nums, int k) {
        int changer = 0;
        k %= nums.length;

        for(int i = 0; i<k; i++){

            for(int j = 1; j< nums.length; j++) {
                changer = nums[nums.length-j];
                nums[nums.length-j] = nums[nums.length-(j+1)];
                nums[nums.length-(j+1)] = changer;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    **/

}
