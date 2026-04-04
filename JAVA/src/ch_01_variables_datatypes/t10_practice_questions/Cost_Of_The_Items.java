package ch_01_variables_datatypes.t10_practice_questions;

//Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser.You have to output the total cost of the items back to the user as their bill.(Add on:You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;

public class Cost_Of_The_Items {
    public static void main(String[] args) {
        Scanner sc       = new Scanner(System.in);
        float pencil     = sc.nextFloat();
        float pen        = sc.nextFloat();
        float eraser = sc.nextFloat();
        
        float Total_Cost = (pencil + pen + eraser); // sum of total cost of all products

        float newTotal = Total_Cost + (Total_Cost * 0.18f); // calculating the GST

        System.out.println("Total Bill (with 18% GST): " + newTotal);
    }

}
