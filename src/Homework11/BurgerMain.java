package Homework11;

public class BurgerMain {
    public static void main(String[] args) {

        System.out.println();

        Burger Burger4 = new Burger(true, 1);

        Burger burger = new Burger(true, 2);
        Burger burger1 = new Burger(false, 1);
        Burger burger2 = new Burger(false, 2);
        Burger burger3 = new Burger(false, 1);


        compare(burger, burger1);
        compare(burger1, burger2);
        compare(burger2, burger3);
        compare(burger3, burger);
        compare(burger, burger2);
        compare(burger1, burger3);

    }
    public static void compare(Burger burger, Burger burger1){
        if (burger == burger1){
            System.out.println("Everything is cool. You have two identical burgers. ");
        } else if (burger.equals(burger1)){
            System.out.println("Everything is cool. You have two identical burgers. ");
        } else {
            System.out.println("Burgers are not identical.");
        }
    }
}
