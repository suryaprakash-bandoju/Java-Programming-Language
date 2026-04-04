package ch_03_conditional_statements.t03_ternary_operator;

public class Ternary_Operator {
    public static void main(String []args) {
        int number = 4;
        String result = (number % 2 == 0) ? "Even" : "ODD";
        System.out.println(result);
    }
}
