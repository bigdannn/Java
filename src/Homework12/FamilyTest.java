package Homework12;

public class FamilyTest {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember("Artur");
        FamilyMember mom = new FamilyMember("Marta");
        FamilyMember child = new FamilyMember("Namastel", dad, mom);

        System.out.println(child);

        FamilyMember dad1 = new FamilyMember("John");
        FamilyMember mom1 = new FamilyMember("Klara");
        FamilyMember child1 = new FamilyMember("Kim", dad1, mom1);

        System.out.println(child1);

    }
}
