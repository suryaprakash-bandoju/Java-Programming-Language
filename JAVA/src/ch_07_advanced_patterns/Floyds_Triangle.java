package ch_07_advanced_patterns;

public class Floyds_Triangle {
    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
