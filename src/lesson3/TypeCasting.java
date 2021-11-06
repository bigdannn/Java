package lesson3;

public class TypeCasting {

    public static void main(String[] args) {
        System.out.println(10);

        int intNumber = 1000;
        long longNumber = 100;
        System.out.println("longNumber before casting: " + longNumber);

        longNumber = intNumber;
        System.out.println("longNumber afyer casting: " + longNumber);

        byte byteNumber = 127;
        short shortNumber = 32000;
        System.out.println("shortNumber before casting: " + shortNumber);

        shortNumber = byteNumber;
        System.out.println("shortNumber after casting: " + shortNumber);

        byteNumber = (byte) shortNumber;
        System.out.println("byteNumber after manual casting: " + byteNumber);




    }
}
