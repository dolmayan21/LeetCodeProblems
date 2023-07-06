package com.java.dolmayan.leetcode.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {7,4,5,8,2,1};

        bubbleSort(arr);

        System.out.println("\n*******\n" + Arrays.toString(arr));
        System.out.println("*******");
    }

    public static void bubbleSort(int[] arr) {
        // Mutates arr so that it is sorted via swapping adjacent elements until
        // the arr is sorted.
        boolean hasSwapped = true;
        while (hasSwapped) {

            hasSwapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println(Arrays.toString(arr));
                if (arr[i] > arr[i + 1]) {
                    // Swap adjacent elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    hasSwapped = true;
                }
            }

        }
    }

}
