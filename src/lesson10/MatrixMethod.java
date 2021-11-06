package lesson10;

public class MatrixMethod {
    public static void main(String[] args) {

        int[][] matrix = createMatrix(4, 5);
        printMatrix(matrix);



    }
    public static void printMatrix ( int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");

                System.out.println();
            }

        }

    }
    public static int[][] createMatrix ( int a, int b){

        int[][] matrix = new int[a][b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }
}
