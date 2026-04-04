package ch_04_loops.t01_while_loop;

import java.util.*;

public class Print_1_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int count = 1;
        while (count <= range) {
            System.out.print(count + " ");
            count++;
        }
    }
}
