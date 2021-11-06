package Homework6;

public class Fibonachi {
    public static void main(String[] args) {

        int a1 = 1;
        int a2 = 1;
        System.out.print(a1 + " " + a2 + " ");

        for (int i = 2; i < 12; i++) {
            int a3 = a1 + a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;


        }
    }
}
