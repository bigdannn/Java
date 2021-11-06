package lesson6;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
         String input = Scanner.nextLine();


        while (!input.equals("stop")) {
            System.out.println("You input" + input);
            input = Scanner.next();
        }

    }
}
