package Homework6;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("input your number");

        Scanner scanner = new Scanner(System.in);
        int usersnumber = scanner.nextInt();

        int random = (int)(Math.random()*10);

        while (usersnumber != random) {
            System.out.println("Try again");
            usersnumber = scanner.nextInt();
        }
        System.out.println("Random number is: " + random);
        System.out.println("You win!");
        }
    }


