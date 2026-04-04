package ch_06_functions_or_methods.t01_functions;

public class Avg_Of_3_Numbers {
    public static void avgOfThreeNum(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        System.out.println("avarage is: " + avg);
    }
    public static void main(String[] args) {
        avgOfThreeNum(3, 5, 8);
    }
}
