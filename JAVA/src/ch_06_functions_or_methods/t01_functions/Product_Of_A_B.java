package ch_06_functions_or_methods.t01_functions;

public class Product_Of_A_B {
    public static int Product(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int product = Product(a, b);
        System.out.println(product);
    }
}
