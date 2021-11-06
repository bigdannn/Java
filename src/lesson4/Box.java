package lesson4;

public class Box {
    public static void main(String[] args) {

        double width = 100.0;
        double height = 56.8;
        double length = 13.4;

        double volume = calculateVolume(width, height, length);

        Methods.printMassage("volume: " + volume);
        Methods.printMassage("new volume: ");

    }

    public static double calculateVolume(double width, double height,double length ){
        return width*height*length;
    }

}
