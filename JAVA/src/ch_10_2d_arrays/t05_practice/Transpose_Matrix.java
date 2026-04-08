package ch_10_2d_arrays.t05_practice;

public class Transpose_Matrix {
    public static void transposeMatrix(int matrix[][]) {
        int transpose[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
    }
    
    public static void printTranspose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        transposeMatrix(matrix);
        printTranspose(matrix);
    }
}
