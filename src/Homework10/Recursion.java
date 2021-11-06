package Homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number:");

        int number = Integer.parseInt(reader.readLine());

        System.out.println(" = " + recursion(number) );
        System.out.println();

    }
    public static int recursion(int n){
        System.out.print(n + " *");
        if (n == 1) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }
}
