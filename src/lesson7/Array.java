package lesson7;

public class Array {
    public static void main(String[] args) {

        int [] numbers = new int[10];
        System.out.println(numbers[0]);

        numbers[1] = 50;
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);

        String[] strings = new String[5];
        strings[0] = "new String";
        System.out.println(strings[0]);
        System.out.println(strings[1]);

        String[] strings2 = strings;
        System.out.println(strings2[0]);


    }
}
