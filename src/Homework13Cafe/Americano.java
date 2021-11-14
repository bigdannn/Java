package Homework13Cafe;

public class Americano extends Drinks {

    public double price;

    public Americano(){
        price = 25;
        System.out.println(toString());
    }

    public String toString(){
        return "You choose americano and it's price is " + price + " ₴";
    }

    public void makeCoffee(){
        System.out.println("You're americano is ready!");

    }

    public double  prices(){
        return price;
    }
}
