package com.java.dolmayan.leetcode.OrderedPath;

import java.util.Stack;

public class isValid {

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '(' || c == '{' || c == '[' ){
                stack.push(c);

            }else{
                if(stack.empty()){
                    return false;
                }else if (c == ')' && stack.peek() == '('){
                    stack.pop();
                }else if (c == ']' && stack.peek() == '['){
                    stack.pop();
                }else if (c == '}' && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
