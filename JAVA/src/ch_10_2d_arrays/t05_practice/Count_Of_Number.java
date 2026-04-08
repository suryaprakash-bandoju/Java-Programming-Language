package ch_10_2d_arrays.t05_practice;

public class Count_Of_Number {
    public static void countNumber(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int n = 8;
        countNumber(matrix, n);
    }
}
