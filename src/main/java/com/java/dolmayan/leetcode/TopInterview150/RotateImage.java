package com.java.dolmayan.leetcode.TopInterview150;

import java.sql.SQLOutput;

public class RotateImage {

    public static void main(String[] args) {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       rotate(matrix);
    }

    public static void rotate(int [][] matrix){
        transpose(matrix);
        reflect(matrix);
    }

    public static void transpose(int [][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    public static void reflect(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }



/***
 * This could be the solution maybe????
 *
 *
 * Not accepted by leetCode...


//    public static void rotate(int[][] matrix) {
//
//        int[][] newMatrix = new int[matrix.length][matrix.length];
//
//        for(int i = 0; i<matrix.length; i++){
//            for(int j = 0; j<matrix.length; j++){
//                newMatrix [i][j] = matrix [((matrix.length-1)-j)][i];
//                System.out.println(matrix[i][j] + "    other new matrix     "  + newMatrix[i][j]);
//            }
//        }
//        matrix = newMatrix;
//    }

***/

}

