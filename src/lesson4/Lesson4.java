package lesson4;

public class Lesson4 {
    public static void main(String[] args) {

    int a = 10;
     int b = 15;
     int c = 17;
     int wp = 120;
     double tax = 0.05;
     int workingperioda = (a*12*10);
        int workingperiodb = (b*12*10);
        int workingperiodc = (c*12*10);
        System.out.println("salary for 10 years of an a worker: " + (a*12*10));
        System.out.println("salary for 10 years of an b worker: " + (b*12*10));
        System.out.println("salary for 10 years of an c worker: " + (c*12*10));

        double ataxes = workingperioda-(workingperioda*tax);
        System.out.println("Taxes for a slary of an a worker: " + ataxes);
        double btaxes = workingperiodb-(workingperiodb*tax);
        System.out.println("Taxes for a slary of an b worker: " + btaxes);
        double ctaxes = workingperiodc-(workingperiodc*tax);
        System.out.println("Taxes for a slary of an c worker: " + ctaxes);

        double aavarage = ataxes/wp;
        System.out.println("Avarage salary of an a worker: " + aavarage);
        double bavarage = btaxes/wp;
        System.out.println("Avarage salary of an a worker: " + bavarage);
        double cavarage = ctaxes/wp;
        System.out.println("Avarage salary of an a worker: " + cavarage);


    }
}
