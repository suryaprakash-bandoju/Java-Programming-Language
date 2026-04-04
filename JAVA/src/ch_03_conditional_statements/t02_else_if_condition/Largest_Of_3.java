package ch_03_conditional_statements.t02_else_if_condition;

public class Largest_Of_3 {
    public static void main(String[] args) {
        int a = 19, b = -44, c = 8;

        if ((a >= b) && (a >= c)) {
            System.out.println("A");
        }
        else if (b >= c) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
    }
}
