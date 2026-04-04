package ch_04_loops.t02_for_loop;

public class Reverse_Given_Number {
    public static void main(String[] args) {
        int n = 10804;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
