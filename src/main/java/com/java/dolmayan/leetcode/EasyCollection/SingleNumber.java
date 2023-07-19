package com.java.dolmayan.leetcode.EasyCollection;

import java.util.Arrays;
import java.util.Stack;

public class SingleNumber {

    public static void main(String[] args) {

       int[] nums = {4,1, 2,1,2};

        //int[] nums = {2,2,1};

        singleNumber(nums);

    }
    public static int singleNumber(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(stack.isEmpty()){
                stack.push(nums[i]);
            }else if(!stack.isEmpty() && stack.peek() == nums[i]){
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() != nums[i]) {
                stack.push(nums[i]);
            }
        }
        return stack.pop();
    }
}

   /*
   * Holly shit...!
   *
    public int singleNumber(int[] nums) {
        //n XOR 0 = n
        //n XOR n = 0
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
   * */