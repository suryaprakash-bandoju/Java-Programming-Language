package ch_08_arrays.t11_max_um_kadanes;

public class Max_Sum_Kadanes {

    public static void randnes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sub-Array is: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        randnes(numbers);
    }
}
