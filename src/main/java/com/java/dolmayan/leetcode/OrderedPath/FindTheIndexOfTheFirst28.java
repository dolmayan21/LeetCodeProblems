package com.java.dolmayan.leetcode.OrderedPath;

public class FindTheIndexOfTheFirst28 {
    public int strStr(String haystack, String needle) {

        if(needle.length()>haystack.length()) return -1;

        if(haystack.contains(needle)){
            int i = haystack.indexOf(needle);
            return i;
        }
        return -1;
    }
}
