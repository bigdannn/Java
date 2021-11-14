package Homework13Cafe;

public class Cappuccino extends Drinks {

    public double price;

    public Cappuccino(){
        price = 35;
        System.out.println(toString());
    }


    @Override
    public String toString(){
        return "You choose cappuccino and it's price is " + price + " ₴";
    }

    public void makeCoffee(){
        System.out.println("You're cappuccino is ready!");
    }

    public double  prices(){
        return price;
    }
}
