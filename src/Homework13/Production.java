package Homework13;

public class Production extends Property{

    public Production(double square){
        super(square);
        System.out.println(toString());
    }

    public double calculateTax(){
        return square*15;
    }
    public void taxSum(){
        System.out.println(toString());
    }

    public String toString(){
        return "Your property tax will be " + calculateTax() + "₴";
    }
}
