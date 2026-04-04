package ch_03_conditional_statements.t02_else_if_condition;

import java.util.*;

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your Tax is " + tax);
    }
}
