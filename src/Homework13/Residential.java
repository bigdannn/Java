package Homework13;

public class Residential extends Property{

    boolean subsidies;

    public Residential(int square, boolean subsidies){
        super(square);
        this.subsidies = subsidies;

        System.out.println(toString());
    }
    @Override
    public double calculateTax(){
        double answer;
        if (subsidies){
            answer = (square*taxAmountPerMeter) - (square*taxAmountPerMeter)*0.2;
        } else {
            answer = (square*taxAmountPerMeter);
        }
        return answer;
    }
    public void taxCalculation(){
        System.out.println("Your property tax will be" + calculateTax() + "₴");
    }

    public String toString(){
        return "Your property tax will be " + calculateTax() + "₴";
    }
}
