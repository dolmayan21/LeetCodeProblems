package com.java.dolmayan.leetcode.SortingExamples;

import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,1,1,2,1};

        int number = heightChecker(arr);
        System.out.println("*****  " + number + "  *****");
        System.out.println(Arrays.toString(arr));

    }
    public static int heightChecker(int[] heights) {
        int counter = 0;
        int newArr[] = new int[heights.length];

        System.arraycopy(heights,0, newArr,0,heights.length);
        Arrays.sort(newArr);

        for(int i = 0; i<heights.length; i++){
            if(newArr[i] != heights[i]){
                counter++;
            }
        }
        return counter;
    }


}
