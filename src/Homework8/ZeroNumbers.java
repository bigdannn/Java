package Homework8;

import java.util.Arrays;

public class ZeroNumbers {
    public static void main(String[] args) {

        int[] numbers = {170, 2, 4, 0 ,256,  5, 0, 6, 10, 0, 4, 7, 8, 9, 0, 33};



        for (int i = 0; i < (numbers.length - 1); i++) {

            for (int j = (numbers.length - 1); j > i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j-1] = numbers [j];
                    numbers[j] = temp;

                }
                System.out.println(Arrays.toString(numbers));

            }
        }
    }
}