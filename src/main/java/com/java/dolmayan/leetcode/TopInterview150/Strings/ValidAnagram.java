package com.java.dolmayan.leetcode.TopInterview150.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram", t = "nwgaram";

        isAnagram(s,t);
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        char [] sArr = s.toCharArray();
        Arrays.sort(sArr);

        char [] tArr = t.toCharArray();
        Arrays.sort(tArr);

        for(int i =0; i<t.length(); i++){
            if(tArr[i] != sArr[i]){
                return false;
            }
        }
        return true;
    }
}
