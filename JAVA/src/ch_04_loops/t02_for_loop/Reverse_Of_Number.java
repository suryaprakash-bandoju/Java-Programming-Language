package ch_04_loops.t02_for_loop;

public class Reverse_Of_Number {
    public static void main(String[] args) {
        int num = 10804;
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;
        }
    }
}
