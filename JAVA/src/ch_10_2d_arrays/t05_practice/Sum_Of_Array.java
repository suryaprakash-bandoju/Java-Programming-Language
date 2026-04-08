package ch_10_2d_arrays.t05_practice;

public class Sum_Of_Array {
    public static void sumOfArray(int matrix[][]) {
        int sum = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[1][j];
            }
        
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        sumOfArray(matrix);
    }
}
