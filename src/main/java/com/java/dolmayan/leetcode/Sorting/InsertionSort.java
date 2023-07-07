package com.java.dolmayan.leetcode.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,4,5,8,2,1};

        insertionSort(arr);

        System.out.println("\n*******\n" + Arrays.toString(arr));
        System.out.println("*******");
    }
    public static void insertionSort(int[] arr) {
        // Mutates elements in arr by inserting out of place elements into appropriate
        // index repeatedly until arr is sorted
        for (int i = 1; i < arr.length; i++) {
            int currentIndex = i;
            while (currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
                // Swap elements that are out of order
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex -= 1;
                System.out.println("Inside -->  " +Arrays.toString(arr));
            }


            System.out.println("\n*******\n  " + Arrays.toString(arr));
            System.out.println("*******\n\n");
        }
    }
}
