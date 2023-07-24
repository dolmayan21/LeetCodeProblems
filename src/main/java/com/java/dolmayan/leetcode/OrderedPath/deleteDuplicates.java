package com.java.dolmayan.leetcode.OrderedPath;

public class deleteDuplicates {

    public static void main(String[] args) {

          int m = 3,  n = 3;
          int nums1[] = new int[]{1, 2, 3, 0, 0, 0};
          int nums2[] = new int[] {2,5,6};

        merge(nums1, m,nums2, n);


    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m+n];
        int k=0, i=0, j=0;

        while(i<m && j<n){
            if(nums1[i]< nums2[j]){
                arr[k++] = nums1[i++];
            }else {
                arr[k++] = nums2[j++];
            }
        }
        while(i<m){
            arr[k++] = nums1[i++];
        }
        while(j<n){
            arr[k++] = nums2[j++];
        }

        for(int x= 0; x< arr.length; x++){
           nums1[x] = arr[x];
        }
    }

    /*
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i =0; i< nums2.length; i++){
            nums1[nums1.length-1-i] = nums2[nums2.length-1-i];
        }

        for(int i =1 ; i < nums1.length; i ++){
            int currIndex = i;
            while (currIndex> 0 && nums1[currIndex-1] > nums1[currIndex]){
             int temp = nums2[currIndex];
             nums2[currIndex] = nums1[currIndex-1];
             nums1[currIndex-1] = temp;
             currIndex -= 1;

            }

        }

    }
    */


}
