package lesson7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFromConsole {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input array size");
        int size = Integer.parseInt(reader.readLine());

        String[] strings = new String[size];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");

        }

    }
}