package lesson8;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int [] numbers = new int [10000];

        long start, end;
        start = System.currentTimeMillis();

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j-1]> numbers[j]){
                    int temp =numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j]= temp;
                }

            }
            }
        end = System.currentTimeMillis();

        System.out.println("Duration: " + (end-start));

        System.out.print(Arrays.toString(numbers));
        }
    }
