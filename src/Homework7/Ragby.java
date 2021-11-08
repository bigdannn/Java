package Homework7;


public class Ragby {
    public static void main(String[] args) {

        int FTAge = 0;
        int STAge = 0;

        int [] firstTeam = new int [25];
        int [] secondTeam = new int[25];
        System.out.println("Age of the participants of the first team:");
        for (int i = 0; i < firstTeam.length; i++) {
            int playersAge1 = (int) (Math.random() * (30-15) + 15);
            System.out.print(playersAge1);
            System.out.print(", ");
            FTAge += playersAge1;
        }
        System.out.println();
        System.out.println("First Team avarage age: " + FTAge/25);
        int a = FTAge/25;


        System.out.println();
        System.out.println("Age of the participants of the second team:");
        for (int i = 0; i < secondTeam.length; i++) {
            int playersAge2 = (int) (Math.random() * (30-15) + 15);
            System.out.print(playersAge2);
            System.out.print(", ");
            STAge +=  playersAge2;
        }
        System.out.println();
        System.out.println("Second Team avarage age: " + STAge/25);
        int b = STAge/25;

        System.out.println();

        if (a == b){
            System.out.println("The average age of the participants of the both teams is equal");
        } else if (FTAge < STAge){
            System.out.println("The age of the participants of the second team is on average higher than the age of the participants of the first team.");
        } else {
            System.out.println("The age of the participants of the first team is on average higher than the age of the participants of the second team.");
        }
    }
}
