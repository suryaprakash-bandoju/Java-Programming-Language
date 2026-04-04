package ch_05_patterns;

public class P02_Pattern {
    public static void main(String[] args) {
        int n = 4;
        for (int l = 1; l <= n; l++) {
            for (int s = 1; s <= n - l + 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
