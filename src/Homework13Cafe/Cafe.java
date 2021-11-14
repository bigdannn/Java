package Homework13Cafe;

import Homework13.Production;
import Homework13.Residential;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Cafe {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to our Cafe! What do you want to drink? We have tea, latte, cappuccino and americano.");


        ArrayList<Drinks> drinks = new ArrayList<>();

        String input;

        while (!(input = reader.readLine()).equals("exit")) {

            Drinks drink;

            switch (input) {
                case "cappuccino":
                    drink = new Cappuccino();
                    drinks.add(drink);
                    break;
                case "americano":
                    drink = new Americano();
                    drinks.add(drink);
                    break;
                case "tea":
                    drink = new Tea();
                    drinks.add(drink);
                    break;
                case "latte":
                    drink = new Latte();
                    drinks.add(drink);
                    break;
                default:
                    System.out.println("We don't know such type of drinks. Sorry.");
            }
        }

        for (Drinks d1: drinks) {
            System.out.println(d1.prices());
        }
        double total = 0;
        for (Drinks d: drinks) {
            total += d.prices();
            d.makeCoffee();
        }
        System.out.println("Your total check will be " + total + " ₴");

    }
}