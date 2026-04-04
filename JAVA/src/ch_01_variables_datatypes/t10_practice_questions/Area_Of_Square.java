package ch_01_variables_datatypes.t10_practice_questions;

//In a program, input the side of a square. You have to output the area of the square.
import java.util.*;
public class Area_Of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of The Square is " + area);
    }
}
