package Homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input array size: ");
        int size = Integer.parseInt(reader.readLine());
        int[] numbers = new int[size];

        System.out.println("Input numbers: ");
        for (int i = 0; i < size; i++) {
            numbers [i] = Integer.parseInt(reader.readLine());
        }

        boolean flag = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i-1]){
                flag = false;
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }


    }
}
