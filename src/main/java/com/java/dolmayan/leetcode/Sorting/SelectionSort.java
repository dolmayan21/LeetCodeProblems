package com.java.dolmayan.leetcode.Sorting;

import java.util.Arrays;

public class SelectionSort {

    /*  Explanation video --->  https://www.youtube.com/watch?v=g-PGLbMth_g
    */

    public static void main(String[] args) {
        int arr[] = {5,4,10,8,7,6,1,2};

        selectionSort(arr);


        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr) {
        // Mutates arr so that it is sorted via selecting the minimum element and
        // swapping it with the corresponding index
        int min_index;
        for (int i = 0; i < arr.length; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // Swap current index with minimum element in rest of list
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

    }



}
