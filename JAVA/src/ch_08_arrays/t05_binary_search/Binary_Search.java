package ch_08_arrays.t05_binary_search;

public class Binary_Search {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        
        while (start <= end) {
            int mid = (start+end)/2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("Key is at the index of: " + binarySearch(numbers, key));
    }
}
