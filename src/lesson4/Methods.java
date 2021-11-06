package lesson4;

public class Methods {
    public static void main(String[] args) {

        printMassage("Hello!");
        printMassage("hi!");
        printMassage("Bye!");


        int number = generateRandom(10);
        printMassage("random number: " + number);

        int newNumber = generateRandom(10000);
        printMassage("random number: " + newNumber);

    }
    public static void printMassage(String massage){
        System.out.println(massage +"123");

    }
    public static int generateRandom(int range){
        int number = (int)(Math.random()*range);
        return number;
    }
    public static String getString(){
        return "String";
    }
}
