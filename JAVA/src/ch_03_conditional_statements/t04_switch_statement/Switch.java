package ch_03_conditional_statements.t04_switch_statement;

public class Switch {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("apple");
                break;
            case 2:
                System.out.println("banana");
                break;
            default:
                    System.out.println("no fruits");
        }
    }
}
