package Homework13;

public class Property {

    public String type;
    public int square;
    public int earnings;
    boolean subsidies;

    public Property(String type){
        this.type = type;
    }

    public Property(int square){
        this.square = square;
    }

    public Property(int square, int earnings){
        this.square = square;
        this.earnings = earnings;
    }
    public int taxCalculation(int square){
        int tax = square*15;
        return tax;
    }
    @Override
    public String toString(){
        return "Your property tax will be " + taxCalculation(square) + "₴";
    }

}
