package ch_02_operators.t03_logical_operators;

public class Logical_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println((a < b) && (a == b));
        System.out.println((a < b) || (a == b));
        System.out.println(!(a > b));
    }
}
