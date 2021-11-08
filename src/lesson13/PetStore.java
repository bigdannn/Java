package lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PetStore {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferreader = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Parrot("Kesha"));
        animals.add(new Cat("Pixel"));
        animals.add(new Dog("Ted"));
        animals.add(new Animal("unknown"));

        String input;
        while(!(input = bufferreader.readLine()).equals("exit")){

            Animal animal;
            String name;
            switch(input){
                case "cat":
                    System.out.println("input cat name");
                    name = bufferreader.readLine();
                    animal = new Cat(name);
                    break;
            }

        }

        for (Animal animal1: animals) {
            animal1.speak();
        }


    }


}
