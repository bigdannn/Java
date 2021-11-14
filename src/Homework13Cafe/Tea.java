package Homework13Cafe;

public class Tea extends Drinks {

    public double price;

    public Tea(){
        price = 20;
        System.out.println(toString());
    }

    public String toString(){
        return "You choose tea and it's price is " + price + "₴";
    }

    public void makeCoffee(){
        System.out.println("You're tea is ready!");
    }

    public double  prices(){
        return price;
    }
}
