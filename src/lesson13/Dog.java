package lesson13;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println(name + "says Bark");
    }
}
