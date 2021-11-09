package Homework13;

public class Production extends Property{

    public Production(int square){
        super(square);

        System.out.println(toString());
    }
    public int taxCalculation(int square){
        return square*15;
    }
    @Override
    public String toString(){
        return "Your property tax will be " + taxCalculation(square) + "₴";
    }

}
