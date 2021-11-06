package Homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CopyingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input 20 different numbers.");
        int [] numbers = new int [20];
        int[] firstTen = new int[10];
        int [] secondTen = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.arraycopy(numbers, 0, firstTen, 0,10);
        System.arraycopy(numbers, 10,secondTen, 0, 10);

        System.out.println();

        System.out.println("First ten numbers: " + Arrays.toString(firstTen));
        System.out.println("Second ten numbers: " + Arrays.toString(secondTen));


    }
}
