package Homework13;

public class Trader extends Property{

    public double earnings;
    public double answer;

    public Trader(double square, double earnings){
        super(square);
        this.earnings = earnings;

        System.out.println(toString());
    }
    @Override
    public double calculateTax(){
        if (earnings < 100){
            answer = (square*15);
        } else {
            answer = square*15 + earnings*0.25;
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
