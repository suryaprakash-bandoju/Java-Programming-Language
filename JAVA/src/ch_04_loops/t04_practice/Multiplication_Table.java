package ch_04_loops.t04_practice;
//Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
