package ch_06_functions_or_methods.t01_functions;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1423));
    }
}
