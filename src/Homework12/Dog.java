package Homework12;

public class Dog {

    public String name;
    public int age;
    public int weight;
    public String breed;

    public static int COUNT;

    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        COUNT++;

    }

    @Override
    public String toString() {
        return "Dog's name: " + this.name + ". " + "Dog's breed: " + this.breed + ". " + "Dog's age: " + this.age + ". " + "Dog's weight: " + this.weight + ". ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        return this.weight == dog.weight && this.age == dog.age;
    }

    public static void printDog() {
        System.out.println("Dogs: " + COUNT);
    }

    public static void compare(Dog dog, Dog dog1) {
        String s = "Breed and age are identical";
        String s1 = "Breed and age are not identical";
        if (dog.equals(dog1)) {
            System.out.println(s);
        } else {
            System.out.println(s1);
        }
    }
}
