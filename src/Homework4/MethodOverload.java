package Homework4;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println("Info");
        printAirplaneInfo("Boeing 737","Passenger");
        printAirplaneInfo("Airbus 330", "Passenger", 120);
        printAirplaneInfo("Praetor 500", "Passenger" , 0, 15);


    }
    public static void printAirplaneInfo(String name, String type){
        System.out.println("Aircraft name " + name + " Aircraft type " + type);
    }
    public static void printAirplaneInfo(String name, String type, int numberofec){
        System.out.println("Aircraft name " + name + " Aircraft type " + type + " Number of economy class seats " + numberofec);
    }
    public static void printAirplaneInfo(String name, String type, int numberofec, int numberofb){
        System.out.println("Aircraft name " + name + " Aircraft type " + type + " Number of economy class seats " + numberofec + " Number of bussines class seats " + numberofb);
    }

}
