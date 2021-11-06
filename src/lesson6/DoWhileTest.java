package lesson6;

public class DoWhileTest {
    public static void main(String[] args) {



        int number = 10;
        do {
            System.out.println("До взрыва бомбы осталось " + number + " секунд");
            number--;
            if(number < 3){
                break;
            }
        } while (number > 0);



        System.out.println("Бомба взорвалась!");
    }
}
