package Homework13Cafe;

public class Latte extends Drinks {

    public double price;

    public Latte(){
        price = 45;
        System.out.println(toString());
    }

    public String toString(){
        return "You choose latte and it's price is " + price + " ₴";
    }

    public void makeCoffee(){
        System.out.println("You're latte is ready!");
    }

    public double  prices(){
        return price;
    }
}
