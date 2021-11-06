package lesson12;

public class ClassTest {
    public static void main(String[] args) {


        Person person = new Person("Bob", 23);
        Person person2 = new Person("Carl", 23);
        Person person3 = new Person("Steeve", 35);
        Person person1 = new Person("judi", 22);


        System.out.println(person.equals(person2));
        System.out.println(person2.equals(person3));

        System.out.println("old age " + person.getAge());
        person.birthday();
        System.out.println(" new age " + person.getAge());



    }
}
