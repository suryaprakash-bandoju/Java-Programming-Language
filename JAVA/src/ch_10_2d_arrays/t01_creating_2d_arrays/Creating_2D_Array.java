package ch_10_2d_arrays.t01_creating_2d_arrays;

import java.util.*;

public class Creating_2D_Array {
    public static boolean search(int matrix[][], int key) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
        
                if (matrix[i][j] == key) {
                    System.out.println("found at cell: [" + i + ", " + j + "]");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 6);
        largest(matrix);
    }
}
