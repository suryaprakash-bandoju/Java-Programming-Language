package ch_06_functions_or_methods.t01_functions;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int myNum = n;
        int rev = 0;
        while (n > 0) {
            int lDigit = n % 10;
            rev = (rev * 10) + lDigit;
            n /= 10;
        }
        if (myNum == rev) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
