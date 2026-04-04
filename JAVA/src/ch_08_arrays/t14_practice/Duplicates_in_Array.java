package ch_08_arrays.t14_practice;

public class Duplicates_in_Array {

    public static boolean duplicatesInArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1};
        System.out.println(duplicatesInArray(nums));
    }
}
