package ch_08_arrays.t03_largest_number;

public class Largest_Number {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -Infinity
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 5, 3, 6, 8, 5, 9 };

        int largest = getLargest(numbers);
        System.out.println("largest number is: " + largest);
    }
}
