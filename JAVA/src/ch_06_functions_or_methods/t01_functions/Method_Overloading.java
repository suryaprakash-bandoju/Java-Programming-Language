package ch_06_functions_or_methods.t01_functions;

public class Method_Overloading {
    // Function with 2 Parameters
    public static int sum(int a, int b) {
        return a + b;
    }
    // Function with 3 Parameters
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    // Function with Float return type
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 6));
        System.out.println(sum(5, 7, 9));
        System.out.println(sum(9.54f, 4.46f));
    }
}
