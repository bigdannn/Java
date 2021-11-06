package lesson8;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort2 {
    public static void main(String[] args) {

        Integer [] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()* 100);

        }

        long start, end;
        start = System.currentTimeMillis();

        Arrays.sort(numbers, Collections.reverseOrder());

        end = System.currentTimeMillis();

        System.out.println("Duration: " + (end-start));
    }
}
