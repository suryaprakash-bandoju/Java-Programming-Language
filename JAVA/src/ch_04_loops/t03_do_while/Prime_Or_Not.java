package ch_04_loops.t03_do_while;

import java.util.*;

public class Prime_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) {
            System.out.println(n + " is Prime");
        }
        else {
            for (int i = 2; i <= Math.sqrt(n) - 1; i++) { // for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(n + " is a Prime");
            }
            else {
                System.out.println(n + " is not Prime");
            }
        }

    }
}
