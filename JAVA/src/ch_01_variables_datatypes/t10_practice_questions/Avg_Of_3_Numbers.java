

//Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers


package ch_01_variables_datatypes.t10_practice_questions;
import java.util.*;

public class Avg_Of_3_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float avg = (A + B + C) / 3;
        System.out.println("Average is " + avg);
    }
}
