package com.java.dolmayan.leetcode.TopInterview150.Strings;

public class ImplementstrStr {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "s1ad";

        strStr(haystack, needle);
    }


    public static int strStr(String haystack, String needle) {

        if(needle.length()>haystack.length()) return -1;

        if(haystack.contains(needle)){
            int i = haystack.indexOf(needle);
            return i;
        }
            return -1;
    }
}
