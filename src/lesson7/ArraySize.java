package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input array size");
        int size = Integer.parseInt(reader.readLine());

        String[] strings = new String[size];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
            System.out.print(strings[i] + ", ");

        }
    }
}
