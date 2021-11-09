package Homework13;

public class Production extends Property{

    public Production(int square){
        super(square);
        System.out.println(toString());
    }

    @Override
    public int taxCalculation(){
        return square*15;
    }
    @Override
    public String toString(){
        return "Your property tax will be " + taxCalculation() + "₴";
    }

}
