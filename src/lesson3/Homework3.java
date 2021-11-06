package lesson3;

public class Homework3 {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 9;

        int  module = Math.abs(a-b);
        double degree = Math.pow(a+b,3);
        double squareroot = (int) Math.sqrt(c);
        double result = (module/degree - squareroot);
        long rresult = Math.round(result);

        System.out.println(rresult);

    }
}
