package Homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите желаемое количество строк: ");
        int raws = Integer.parseInt(reader.readLine());

        System.out.println("Введите желаемое количество столбцов: ");
        int colums = Integer.parseInt(reader.readLine());

        System.out.println("Вводите желаемые значения: ");

        int matrix[][] = new int[raws][colums];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        printMatrix(matrix);


    }
    public static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
