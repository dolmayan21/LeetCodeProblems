package com.java.dolmayan.leetcode.EasyCollection;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] nums = {8,2,0,4,5,6,3,7};
        int k= 2;

        rotate(nums,k);

    }
    public static void rotate2(int[] nums, int k) {
        // speed up the rotation
        k %= nums.length;

        int temp, previous;

        System.out.println("ORIGINAL \n " + Arrays.toString(nums) + "\n*******\n\n");
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];  //7
            System.out.println("\n\n");
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];  //8  ,2 ,0

                nums[j] = previous;   // 7, 8, 2

                previous = temp;    //  8    , 2, 0

                System.out.println(Arrays.toString(nums) + "\n*******\n\n");
            }
        }
    }

    /*
    *       OVERHELMED haha..
    *
    *
    */
    public static void rotate(int[] nums, int k) {
        int changer = 0;
        k %= nums.length;

        System.out.println("Module of k ="+k);
        System.out.println("ORIGINAL \n " + Arrays.toString(nums) + "\n*******\n\n");
        for(int i = 0; i<k; i++){

            for(int j = 1; j< nums.length; j++) {
                changer = nums[nums.length-j];
                nums[nums.length-j] = nums[nums.length-(j+1)];
                nums[nums.length-(j+1)] = changer;
                System.out.println(Arrays.toString(nums) + "\n*******\n\n");
            }
            System.out.println(Arrays.toString(nums));
        }
    }



}
