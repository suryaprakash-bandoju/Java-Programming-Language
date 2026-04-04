package ch_06_functions_or_methods.t01_functions;

import java.util.*;
public class EvenOrOdd {
    public static boolean isEvenOrOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = sc.nextInt();
        if (isEvenOrOdd(num)) {
            System.out.println("This is a Even number");
        }
        else {
            System.out.println("This is a Odd number");
        }
    }
}
