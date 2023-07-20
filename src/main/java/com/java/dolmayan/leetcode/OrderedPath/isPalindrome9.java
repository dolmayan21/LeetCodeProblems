package com.java.dolmayan.leetcode.OrderedPath;

public class isPalindrome9 {

    /**
     * Given an integer x, return true if x is a palindrome,
     * and false otherwise.
     */

    public boolean isPalindrome(int x) {

      String num = String.valueOf(x);

        for(int i=0; i<num.length()/2; i++){
            if(num.charAt(i) != num.charAt(num.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
