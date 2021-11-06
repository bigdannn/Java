package lesson10;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 10;

        int result = number > 0 ? 500 / number : 0;

        if (number > 0) {
            result = 500 / number;
        } else {
            result = 0;
        }
    }
}
