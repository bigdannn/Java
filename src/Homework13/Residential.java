package Homework13;

public class Residential extends Property{

    public Residential(int square, boolean subsidies){
        super(square);
        this.subsidies = subsidies;

        System.out.println(toString());
    }
    @Override
    public int taxCalculation(){
        int answer;
        if (subsidies){
            answer = (int) ((square*15) - (square*15)*0.2);
        } else {
            answer = (square*15);
        }
        return answer;
    }

    @Override
    public String toString(){
        return "Your property tax will be " + taxCalculation() + "₴";
    }
}
