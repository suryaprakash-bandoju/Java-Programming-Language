package ch_06_functions_or_methods.t01_functions;

public class Prime_Not_Prime {
    public static boolean isPrime(int n) {
        // Corner case
        if (n == 2) {
            return true;
        }
        // Method for n>=2
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
}
