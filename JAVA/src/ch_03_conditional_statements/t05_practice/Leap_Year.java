package ch_03_conditional_statements.t05_practice;

public class Leap_Year {
    public static void main(String[] args) {
        int year = 2000;

        if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not leap Year");
        }
    }
}
