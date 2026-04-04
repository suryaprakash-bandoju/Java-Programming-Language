package ch_04_loops.t01_while_loop;

import java.util.*;;

public class Sum_Of_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int count = 1;
        int sum = 0;

        while (count <= range) {
            sum += count;
            count++;
        }
        System.out.println("Sum is: " + sum);
    }
}
