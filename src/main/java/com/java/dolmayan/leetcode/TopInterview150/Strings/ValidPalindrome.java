package com.java.dolmayan.leetcode.TopInterview150.Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replace(" ","").replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder s2 = new StringBuilder();
        s2.append(s);
        s2.reverse();

        if(s.equals(s2.toString())){
            return true;
        }
        return false;
    }
}
