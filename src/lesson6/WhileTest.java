package lesson6;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 10;
        while(0 <= count){
            if (count%2 == 0){
            System.out.println(count);}

            count--;

        }
    }
}
