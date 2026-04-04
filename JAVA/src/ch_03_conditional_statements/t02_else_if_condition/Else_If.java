package ch_03_conditional_statements.t02_else_if_condition;

public class Else_If {
    public static void main(String[] args) {
        int age = 14;
        if (age >= 18) {
            System.out.println("adult");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("child");
        }
    }
}
