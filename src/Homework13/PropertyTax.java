package Homework13;

import lesson13.Animal;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class PropertyTax {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello! Please, wright down which type of property do you have: trader, residential or production. ");

        ArrayList<Property> properties = new ArrayList<>();


        String input;
        int square;
        int earnings;
        String subsidies;
        boolean s;

        while (!(input = reader.readLine()).equals("exit")) {

            Property property;
            String type;
            switch (input) {
                case "trader":
                    System.out.println("How much square meters does your property has?");
                    square = Integer.parseInt(reader.readLine());
                    System.out.println("How much money do you earn by using your property?");
                    earnings = Integer.parseInt(reader.readLine());
                    property = new Trader(square, earnings);
                    break;
                case "production":
                    System.out.println("How much square meters does your property has?");
                    square = Integer.parseInt(reader.readLine());
                    property = new Production(square);
                    break;
                case "residential":
                    System.out.println("How much square meters does your property has?");
                    square = Integer.parseInt(reader.readLine());
                    System.out.println("Do you have subsidies?(Answer true or false.)");
                    if (Objects.equals(reader.readLine(), "true")) {
                        s = true;
                        property = new Residential(square, s);
                    } else {
                        s = false;
                        property = new Residential(square, s);
                    }
                    break;
                default:
                    System.out.println("We don't know such type of property. Sorry.");
            }
        }

    }

}
