package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTraining {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input ten numbers: ");

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());

        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ", ");

        }

        }
    }

