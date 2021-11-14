package Homework13Cafe;

public class Drinks {

     public double price;

     public Drinks(){
         price = 20;
     }

     @Override
    public String toString(){
        return "You choose coffee and it's price is " + price;
    }
    public double  prices(){
         return price;
    }

    public void makeCoffee(){
        System.out.println("You're coffee is ready!");
    }



}
