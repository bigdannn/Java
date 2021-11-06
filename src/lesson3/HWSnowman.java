package lesson3;

public class HWSnowman {
    public static void main(String[] args) {


        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double a = 4;
        double b =3;
        double P = Math.PI;
        double density = 0.7;

        double firstball = (a/b*P*Math.pow(r1,3));
        double firstballweight = firstball*density;

        double secondball = (a/b*P*Math.pow(r2,3));
        double secondballweight = secondball*density;

        double thirdball = (a/b*P*Math.pow(r3,3));
        double thirdballweight = thirdball*density;

        float totalweight = (float) (firstballweight + secondballweight + thirdballweight);




        System.out.println("Total weight of the snowman is: " + totalweight + " kg/m3");



    }
}
