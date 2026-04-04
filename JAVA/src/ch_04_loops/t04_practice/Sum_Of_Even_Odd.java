package ch_04_loops.t04_practice;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers

public class Sum_Of_Even_Odd {
    public static void main(String[] args) {
        int n = 5;
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
