package Homework8;

import lesson8.ArraySorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lotery {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input 10 numbers from 0 to 9, please.");

        int [] random = new int [10];
        int [] input = new int[10];


        for (int i = 0; i < random.length; i++) {
            random [i] = (int) (Math.random()* 10);
        }
        System.out.println();
        Arrays.sort(random);

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(reader.readLine());
        }
         Arrays.sort(input);
        System.out.println("Random numbers:" + Arrays.toString(random));
        System.out.println("You input:" + Arrays.toString(input));

        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (random[i] == input [i]){
                System.out.println("You guessed " + i + " index.");
                count++;
            }
        }
        System.out.println("Количество совпадений: " + count);
    }
}
