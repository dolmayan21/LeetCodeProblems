package com.java.dolmayan.leetcode.TopInterview150.Strings;

import java.util.Arrays;

public class ReverseInteger {

    public static void main(String[] args) {

        int x = 123456789;

        reverse(x);
    }
    public static int reverse(int x) {

        char temp;

        char [] charArray = Integer.toString(x).toCharArray();


        for(int i = 0; i<charArray.length/2; i++){
            temp = charArray[charArray.length-i-1];
            charArray[charArray.length-i-1] = charArray[i];
            charArray[i] = temp;
        }

        int number = Integer.parseInt(new String(charArray));

        System.out.println(number);
        return number;
    }




}
