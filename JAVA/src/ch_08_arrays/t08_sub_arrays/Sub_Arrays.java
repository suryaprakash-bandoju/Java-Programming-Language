package ch_08_arrays.t08_sub_arrays;

public class Sub_Arrays {

    public static void printSubArray(int numbers[]) {
        int ts = 0;
        int curr = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                    if (sum > curr) {
                        curr = sum;
                    }
                }
                ts++;
                System.out.println("---> Total sum: " + sum);
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays are: " + ts);
        System.out.println("Maximum Sum Sub-Array: "+curr);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArray(numbers);
    }
}
