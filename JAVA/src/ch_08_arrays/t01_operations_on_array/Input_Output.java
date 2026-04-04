package ch_08_arrays.t01_operations_on_array;


import java.util.*;
public class Input_Output {
    public static void main(String[] args) {

        int marks[] = new int[50]; // Array is created

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); // Math marks input
        marks[1] = sc.nextInt(); // chem marks input
        marks[2] = sc.nextInt(); // phy marks input

        System.out.println("math : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("phy  : " + marks[2]);

        marks[0] = sc.nextInt(); // updating the marks
        System.out.println("math : " + marks[0]);

        marks[1] = marks[1] + 2; // updating marks + 2
        System.out.println("chem : " + marks[1]);
    }
}
