package com.java.dolmayan.leetcode.EasyCollection;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    * Given an integer array nums, return true if any
    * value appears at least twice in the array, and
    *  return false if every element is distinct.
    *
    */

    public static void main(String[] args) {
        int arr[]= {0,4,5,0,3,6};
        containsDuplicate(arr);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set listSet = new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            if(!listSet.add(nums[i])) return  true;
        }
        return false;
    }

}
