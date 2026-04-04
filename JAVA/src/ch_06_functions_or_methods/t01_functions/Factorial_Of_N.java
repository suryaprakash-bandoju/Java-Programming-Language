package ch_06_functions_or_methods.t01_functions;

public class Factorial_Of_N {
    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }
}
