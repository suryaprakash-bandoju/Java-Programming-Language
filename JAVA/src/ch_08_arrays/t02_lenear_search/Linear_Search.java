package ch_08_arrays.t02_lenear_search;

public class Linear_Search {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 40, 21, 32, 50, 60, 10, 9, 31, 44, 35 };
        int key = 99;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Index of the Key is " + index);
        }
    }
}
