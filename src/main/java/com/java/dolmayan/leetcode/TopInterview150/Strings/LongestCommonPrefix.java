package com.java.dolmayan.leetcode.TopInterview150.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};

        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));

        int i =0;
        while(strs[0].length() != 0){
            for( i = 0; i<strs[0].length(); i++){
                for(int j = 1; j<strs.length; j++) {
                    if (strs[0].charAt(i) != strs[j].charAt(i)) {
                        return strs[0].substring(0, i);
                    }
                }
            }
            return strs[0].substring(0,i);
        }
        return "";
    }

}
