package com.java.dolmayan.leetcode.TopInterview150;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char [] s= {'H','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        char temp;
        for(int i = 0; i<s.length/2; i++){
            temp = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = temp;
        }
        System.out.println(Arrays.toString(s));

    }


}
