package lesson12;

public class Person {

    private String name;
    private int age;

    public Person() {
        System.out.println("Person is created.");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person's: name=" + this.name + ", age=" + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return this.age == person.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void birthday() {
        System.out.println("Happy Birthday!!");
        ++this.age;

    }
}
