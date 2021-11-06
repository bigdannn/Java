package lesson10;

public class Recursion {
    public static void main(String[] args) {
        recursion(0);
    }
    public static void recursion(int count) {
        System.out.println("Hello " + ++count);
        if (count >= 100) {
            return;
        }
        recursion(count);
    }
}
