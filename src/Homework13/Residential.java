package Homework13;

public class Residential extends Property{

    public Residential(int square, boolean subsidies){
        super(square);
        if (subsidies){
            System.out.println("Your property tax will be " + ((square*15) - (square*15)*0.2)+ "₴");
        } else {
            System.out.println("Your property tax will be " + (square*15) + "₴");
        }
    }
}
