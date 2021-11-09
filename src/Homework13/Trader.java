package Homework13;

public class Trader extends Property{

    public Trader(int square, int earnings){
        super(square);
        this.earnings = earnings;

        System.out.println(toString());
    }

    @Override
    public int taxCalculation(){
        int answer;
        if (earnings < 100){
            answer = (square*15);
        } else {
            answer = (int) (square*15 + earnings*0.25);
        }
        return answer;
    }
    @Override
    public String toString(){
        return "Your property tax will be " + taxCalculation() + "₴";
    }

}
