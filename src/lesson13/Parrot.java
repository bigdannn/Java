package lesson13;

public class Parrot extends Animal{

    public Parrot(String name){
        super(name);
    }
    @Override
    public void speak() {
        super.speak();
        System.out.println(name + " says Karamba");
    }
}
