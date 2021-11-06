package lesson10;

public class Recursion {
    public static int COUNT =0;
    public static void main(String[] args) {

     recursion();

    }

    public static void recursion(){
        System.out.println("Hello" + ++COUNT );
        recursion();
    }
}
