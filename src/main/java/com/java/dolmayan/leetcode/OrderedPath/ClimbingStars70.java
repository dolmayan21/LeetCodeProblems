package com.java.dolmayan.leetcode.OrderedPath;

public class ClimbingStars70 {


    /**
     *
     * Fubonacci Series
     *
     */
    public int climbStairs(int n) {
        int prev = 1;
        int curr = 1;
        int temp = 0;

        for(int i = 1; i<n; i++){
            temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }

}
