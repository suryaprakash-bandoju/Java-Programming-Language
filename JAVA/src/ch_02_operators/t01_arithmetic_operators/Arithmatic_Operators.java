package ch_02_operators.t01_arithmetic_operators;

public class Arithmatic_Operators {
    public static void main(String[] args) {
        // Binary Operators
        int A = 15;
        int B = 10;
        System.out.println("Addition " + (A + B));
        System.out.println("Subtraction " + (A - B));
        System.out.println("Multiplication " + (A * B));
        System.out.println("Division " + (A / B));
        System.out.println("Modulo(Reminder) " + (A % B));

        // Unary Operators
        // Pre Increment
        int C = 10;
        int D = ++C; // For Pre Decrement --C
        System.out.println(C);
        System.out.println(D);

        // Post Increment
        int E = 10;
        int F = E++; // For Post Decrement E++
        System.out.println(E);
        System.out.println(F);
    }
}
