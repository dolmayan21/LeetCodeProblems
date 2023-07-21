package com.java.dolmayan.leetcode.OrderedPath;

public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {

        int j = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }



        return j+1;
    }
}
