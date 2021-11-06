package Homework6;

public class UnfortunateNumbers {
    public static void main(String[] args) {

        int a = 0;

        while (a <= 100) {
            if (a % 10 == 4){
                System.out.print(" - ");
            } else if (a % 10 == 9) {
                System.out.print(" - ");
            }else if (a/10 == 4.) {
                System.out.print(" - ");

            } else if (a/10 == 9.){
                System.out.print(" - ");
            }
            else {
            System.out.print(" " + a);}
            a++;

        }
    }
}
