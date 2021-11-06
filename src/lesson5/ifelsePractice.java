package lesson5;

import java.util.Scanner;

public class ifelsePractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();


        if (100 < number && number<= 500) {
            System.out.println("Congratulations! You won 10.000$");
        }
        else if (500 < number && number <= 1000) {
            System.out.println("Congratulations! You won 20.000$");
        }
        else if (number > 1000) {
            System.out.println("Congratulations! You won 50.000$");
        }
        else {
            System.out.println("Sorry, but you don't have enough scores");
        }
    }
}
