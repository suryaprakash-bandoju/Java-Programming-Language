package ch_08_arrays.t04_smallest_number;

public class Smallest_Number {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = { 5, 6, 2, 6, 8, 9, 3, 4 };

        int smallest = getSmallest(numbers);
        System.out.println("largest number is: " + smallest);
    }
}
