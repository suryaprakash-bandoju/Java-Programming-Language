package ch_09_sorting.t04_inbuilt_sort;

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
    public static void main(String[] args) {
        // Ascending order
        int arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Descending order
        Integer arrr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arrr, Collections.reverseOrder());
        for (int i = 0; i < arrr.length; i++) {
            System.out.print(arrr[i] + " ");
        }
        System.out.println();
    }
}
