package ch_06_functions_or_methods.t01_functions;

public class BinToDec {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;
        while (binNum > 0) {
            int lastDIgit = binNum % 10;
            decNum = decNum + (lastDIgit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    public static void main(String[] args) {
        binToDec(10101);
    }
}
