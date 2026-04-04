package ch_06_functions_or_methods.t01_functions;

public class Binomial_Coeff {
    // Factorial Function
    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }
    // Bionomial Coefficient Function
    public static int BioCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bioCoeff = fact_n / (fact_r * fact_nmr);
        return bioCoeff;
    }
    public static void main(String[] args) {
        int bioCoeff = BioCoeff(5, 2);
        System.out.println(bioCoeff);
    }
}
