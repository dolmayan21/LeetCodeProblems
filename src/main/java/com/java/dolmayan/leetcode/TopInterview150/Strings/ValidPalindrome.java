package com.java.dolmayan.leetcode.TopInterview150.Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    /**
     **** Better solution ****
     */
    public static boolean isPalindrome(String s) {
        short len = (short)s.length();
        int left = 0;
        int right = len -1;
        while(left < right){
            char chl = s.charAt(left);
            char chr = s.charAt(right);

            if(!Character.isLetterOrDigit(chl)) left++;
            else if(!Character.isLetterOrDigit(chr)) right--;
            else if(Character.toLowerCase(chl) != Character.toLowerCase(chr)) return false;
            else {
                left++;
                right--;
            }
        }

        return true;
    }

    /**** Not bad at all.
     *
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

     **/
}
