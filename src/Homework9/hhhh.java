package Homework9;

import java.util.Arrays;

public class hhhh {
    public static void main(String[] args) {
        int [][] numbers = new int[4][4];
        generateRandom(numbers);
        printMatrix(numbers);
        checkMatrix(numbers);
    }
    public static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    public static void generateRandom(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++){
           matrix[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }
public static void checkMatrix(int[][] matrix){
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j] < 0){
                System.out.print("[" + i + "; " + j + "]");
            }
        }
    }
}
}
