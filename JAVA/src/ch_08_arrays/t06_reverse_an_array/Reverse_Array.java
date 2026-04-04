package ch_08_arrays.t06_reverse_an_array;

public class Reverse_Array {
    public static void reverseArray(int numbers[]) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            start = numbers[end];
            end = temp;

            start++;
            end++;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
