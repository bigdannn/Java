package Homework9;

import java.util.Arrays;

public class NegativeNumbers {
    public static void main(String[] args) {

        int numbers[][] = new int [4][4];
        int count = 0;
        String[][] adress = new String[4][4];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = (int) (Math.random() * 20 - 10);

                if (numbers[i][j] < 0){
                    count++;
                    adress[i][j]= "[" + i + " " + j + "]" + "; ";
                }

                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество отрицательных чисел = " + count);
        System.out.println(Arrays.deepToString(adress));

    }

}
