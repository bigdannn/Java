package Homework4;

public class Person {
    public static void main(String[] args) {
        personInfo("Donald","Trump", "Washington", 256423249);
        personInfo("Vladimir", "Putin", "Moscow", 372746284);
        personInfo("Veronika", "Stepanova","Mexico", 902234234);
    }
    public static String personInfo(String firstName,String secondName, String city , int number){
        System.out.println("You can call " + firstName + " " + secondName + " from " + city + " by using number " + number);
        return firstName + secondName + city + number;

    }

}
