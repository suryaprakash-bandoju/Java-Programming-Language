package ch_03_conditional_statements.t04_switch_statement;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Choose the Operation (+,-,*,/,%): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            case '%':
                System.out.println("Modulo: " + (a % b));
                break;
        }

    }
}
