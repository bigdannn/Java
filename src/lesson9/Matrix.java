package lesson9;

public class Matrix {
    public static void main(String[] args) {
        int [][]coordinates = new int [5][5];


        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                if (i == j) {
                    coordinates[i][j] = 1;
                }
                System.out.print(coordinates[i][j] + " ");
            }
            System.out.println();
        }
    }
}
