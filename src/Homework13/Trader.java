package Homework13;

public class Trader extends Property{

    public Trader(int square, int earnings){
        super(square);
        this.earnings = earnings;
        taxCalculation();
    }


    public int taxCalculation(){
        int answer;
        if (earnings < 100){
            answer = (square*15);
            System.out.println("Your property tax will be " + answer + "₴");
        } else {
            answer = (int) (square*15 + earnings*0.25);
            System.out.println("Your property tax will be " + answer + "₴");
        }
        return answer;
    }

}
