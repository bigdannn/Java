package Homework13;

public class Property {

    public double square;
    public int taxAmountPerMeter = 15;

    public Property(double square){
        this.square = square;
    }
    public double calculateTax(){
        return square*taxAmountPerMeter;
    }

    public String toString(){
        return "Your property tax will be " + calculateTax() + "₴";
    }
}
