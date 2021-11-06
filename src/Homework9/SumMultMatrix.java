package Homework9;

import java.util.Arrays;

public class SumMultMatrix {
    public static void main(String[] args) {
        int C [][] = new int [3][3];
        int D [][] = new int [3][3];
        int sum[][] = new int [3][3];
        int mult [][] = new int [3][3];

        System.out.println("First matrix");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = (int) (Math.random() * 100);
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second matrix");
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                D[i][j] = (int) (Math.random() * 100);
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of Matrix");

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum [i][j] = C[i][j] + D [i][j];

                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of matrix");

        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult.length; j++) {
                mult [i][0] = (C[i][0] * D[0][0])+ (C[i][1] * D[1][0])+ (C[i][2] * D[2][0]);
                mult [i][1] = (C[i][0] * D[0][1])+ (C[i][1] * D[1][1])+ (C[i][2] * D[2][1]);
                mult [i][2] = (C[i][0] * D[0][2])+ (C[i][1] * D[1][2])+ (C[i][2] * D[2][2]);


                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }

    }
}
