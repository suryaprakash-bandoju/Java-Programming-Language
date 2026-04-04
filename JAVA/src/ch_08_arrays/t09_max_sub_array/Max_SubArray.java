package ch_08_arrays.t09_max_sub_array;

public class Max_SubArray {

    public static void max_sum_subarray(int numbers[]) {
        int max_sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                    if (sum >= max_sum) {
                        max_sum = sum;
                    }
                }
                System.out.println(sum);
            }
            System.out.println();
        }
        System.out.println("MAx Sum-SubArray : "+max_sum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        max_sum_subarray(numbers);
    }
}
