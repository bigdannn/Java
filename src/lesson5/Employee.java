package lesson5;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input your bid");
        int number = in.nextInt();
        System.out.println("Here is you year salary " + number*12 + ".000$");

        System.out.println("input your work experince");
        int experience = in.nextInt();
        if (1 < experience && experience <5  ) {
            System.out.println("Sorry, you don't have any bonuses");
        }
        else if (experience > 5){
            System.out.println("Here is your bonus " + 10000 + "$");
        }
        else {
            System.out.println("Sorry, you don't have any bonuses");
        }



    }
}
