package Homework12;

public class FamilyMember {

    public String membersName;
    public String childsName;

    FamilyMember dad;
    FamilyMember mom;

    public FamilyMember(String membersName) {
        this.membersName = membersName;
        System.out.println(membersName);

    }
    public FamilyMember(String childsName, FamilyMember dad, FamilyMember mom){
        this.childsName = childsName;
        this.dad = dad;
        this.mom = mom;
    }

    @Override
    public String toString() {
        return this.childsName + " is " + dad.membersName + " and " + mom.membersName + "'s child.";
    }
}
