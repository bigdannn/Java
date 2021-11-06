package Homework5;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Write your score for each of the subjects from 1 to 12.");
        System.out.println("Input your rate on Math: ");
        int number1 = scanner.nextInt();
        System.out.println("Input your rate on Physics: ");
        int number2 = scanner.nextInt();
        System.out.println("Input your rate on Physical Culture: ");
        int number3 = scanner.nextInt();
        System.out.println("Input your rate on Geography: ");
        int number4 = scanner.nextInt();
        System.out.println("Input your rate on History: ");
        int number5 = scanner.nextInt();

        int sum = (number1 + number2 + number3 + number4 + number5)/5;

        if (sum >= 10) {

            System.out.println("Congratulations! You've got increased scholarships!");

        } else if (8 <= sum && sum < 10) {
            System.out.println("Congratulations! You've got scholarship!");
        } else {
            System.out.println("Sorry, you don't have scholarship.");
        }




    }
}
