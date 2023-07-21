package com.java.dolmayan.leetcode.OrderedPath;

import java.util.Stack;

public class isValid20 {

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> c = new Stack<>();

        for(int i =0; i<s.length(); i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                    c.push(s.charAt(i));
                }else{
                    if(c.isEmpty()){
                        return false;
                    }else if ( s.charAt(i) == ')' && c.peek() == '('){
                        c.pop();
                    }else if ( s.charAt(i) == ']' && c.peek() == '['){
                        c.pop();
                    }else if ( s.charAt(i) == '}' && c.peek() == '{'){
                    c.pop();
                    }else{
                        return false;
                    }
                }

            }

           return c.isEmpty();

        }


    /**
     *  Solution by God
     */


    /*
        public boolean isValid(String s) {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0
                    && ((stack[i] == '(' && ch == ')')
                        || (stack[i] == '{' && ch == '}')
                        || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }
     */
}
