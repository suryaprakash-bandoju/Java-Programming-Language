package ch_03_conditional_statements.t05_practice;

import java.util.*;

public class Positive_Negative {
    // Write a Java program to get a number from the user and print whether it is positive or negative.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
