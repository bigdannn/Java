package Homework12;

public class DogTest {
    public static void main(String[] args) {

        Dog dog = new Dog("Zak", "Mastiff", 5, 25);
        Dog dog1 = new Dog("Nick", "Terrier", 4, 3);
        Dog dog2 = new Dog("Manchik", "Pug", 4, 3);

        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println();


        System.out.print(dog.getName());
        System.out.print(" "+ dog.getAge() + " ");
        System.out.print(" " + dog.getBreed()+ " ");
        System.out.println(dog.getWeight());

        dog.setName("Jinny");
        dog.setBreed("Shepherd");
        dog.setAge(10);
        dog.setWeight(15);

        System.out.print(dog.getName());
        System.out.print(" "+ dog.getAge() + " ");
        System.out.print(" " + dog.getBreed()+ " ");
        System.out.println(dog.getWeight());


        dog1.setAge(5);
        dog2.setAge(5);

       Dog.compare(dog, dog1);
       Dog.compare(dog1, dog2);


        System.out.println(dog.equals(dog2));

        Dog.printDog();

    }
}
