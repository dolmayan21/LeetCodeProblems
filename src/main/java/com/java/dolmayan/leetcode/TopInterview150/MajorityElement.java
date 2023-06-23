package com.java.dolmayan.leetcode.TopInterview150;

public class MajorityElement {

    /*
    *Given an array nums of size n, return the majority element.
    * The majority element is the element that appears more than
    *  ⌊n / 2⌋ times. You may assume that the majority element
    * always exists in the array
    *
    * CHECK UP LATER...
    *
    *
    * */

    public static void main(String[] args) {

        int arr[] = {8,8,7,7,7};

        majorityElement2(arr);
    }


    public static int majorityElement(int[] nums) {
        int count = 0, maxElement = 0;
        for(int num: nums) { //8
            System.out.println(num);
            if(count == 0) {
                maxElement = num;
            }
            if(num == maxElement) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("**********   " +maxElement + "   **********");
        return maxElement;
    }

    public static int majorityElement2(int[] arr) {

        int count = 0;
        for(int i =0; i<arr.length; i++){
            for(int k=0; k< arr.length; k++){
                if(arr[i] == arr[k]){
                    count++;
                    if(count> arr.length/2) {
                        System.out.println("******   "+arr[i]+"    *******");
                        return arr[i];
                    }
                }
            }
            count =0;
        }
        return 0;
    }

}
