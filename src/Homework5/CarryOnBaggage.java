package Homework5;

import java.util.Scanner;

public class CarryOnBaggage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of your Baggage: ");
        int height = scanner.nextInt();
        System.out.println("Enter the width of your Baggage: ");
        int width = scanner.nextInt();
        System.out.println("Enter the length of your Baggage: ");
        int length = scanner.nextInt();

        if (height <= 53 && width <= 40 && length <= 22) {
            System.out.println("That's Ok.");
        }
       else if (height <= 40 && width <= 55 && length <= 20) {
            System.out.println("That's Ok.");
        }
        else {
            System.out.println("Sorry, you can't take this as your carry-on baggage.");
        }

    }
}
