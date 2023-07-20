package com.java.dolmayan.leetcode.OrderedPath;

import java.util.ArrayList;

public class romanToInt {


    public int romanToInt(String s) {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer sum = 0;
        Integer count = 0;

        for( char a : s.toUpperCase().toCharArray()){
            int temp = (a =='I')? 1 : (a =='V')? 5 :(a =='X')? 10 : (a =='L')? 50 :(a =='C')? 100 :
                    (a =='D')? 500 : 1000;

            arr.add(temp);  ///   xix
        }
        for(int i= 0; i<arr.size(); i++){
            if(i > 0){
                if(arr.get(i - 1) < arr.get(i)){
                    sum = sum - arr.get(i-1) + ( arr.get(i) - arr.get(i - 1)  );
                }else {
                    sum = arr.get(i) + sum;
                }
            }else {
                sum = arr.get(i);
            }
        }
        return sum;
    }

    /**
     * Solution by God...
     */

    /*
    public int romanToInt(String s) {
        int res = 0, num = 0, prev = 0;

        for(int i=s.length()-1; i>=0; i--) {
           switch(s.charAt(i)) {
               case 'M'-> num = 1000;
               case 'D'-> num = 500;
               case 'C'-> num = 100;
               case 'L'-> num = 50;
               case 'X'-> num = 10;
               case 'V'-> num = 5;
               case 'I'-> num = 1;
           }
           if(prev > num) {
               res -= num;
           } else {
               res += num;
           }
           prev = num;
        }
        return res;
    }

    */

}
