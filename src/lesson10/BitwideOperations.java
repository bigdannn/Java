package lesson10;

public class BitwideOperations {
    public static void main(String[] args) {

        Long number = 46L;

        System.out.println("number");
        System.out.println(number);
        System.out.println(Long.toBinaryString(number));

        System.out.println("number");
        Long notNumber = ~number;
        System.out.println(Long.toBinaryString(notNumber));
        System.out.println(notNumber);

        int n1 = 56;
        int n2 = 34;

        System.out.println("56 = " + Integer.toBinaryString(n1));
        System.out.println("34 = " + Integer.toBinaryString(n2));
        System.out.println("56 & 34 = " + Integer.toBinaryString(n1 & n2));
        System.out.println("56 & 34 = " + (n1 & n2));

        System.out.println("56 | 34 = " + Integer.toBinaryString(n1 | n2));
        System.out.println("56 | 34 = " + (n1 | n2));

        System.out.println("56 ^ 34 = " + Integer.toBinaryString(n1 ^ n2));
        System.out.println("56 ^ 34 = " + (n1 ^ n2));

        int n = 64;

        System.out.println(n + " " + Integer.toBinaryString(n));

        System.out.println(n + " << 1 = " + Integer.toBinaryString(n << 1));
        System.out.println(n + " << 1 = " + (n << 1));

        System.out.println(n + " << 3 = " + Integer.toBinaryString(n << 3));
        System.out.println(n + " << 3 = " + (n << 3));

        System.out.println(n + " >> 1 = " + Integer.toBinaryString(n >> 1));
        System.out.println(n + " >> 1 = " + (n >> 1));

        System.out.println(n + " >> 3 = " + Integer.toBinaryString(n >> 3));
        System.out.println(n + " >> 3 = " + (n >> 3));

        System.out.println("47 = " + Integer.toBinaryString(47));
        System.out.println("47 >> 1 = " + Integer.toBinaryString(47 >> 1));
        System.out.println("47 >> 1 = " + (47 >> 1));
    }
}
