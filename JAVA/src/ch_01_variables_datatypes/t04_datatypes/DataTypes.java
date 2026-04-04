package ch_01_variables_datatypes.t04_datatypes;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 2; // 1 byte = 8 bits --> -128 to 127 = 256
        System.out.println(b);

        short s = 11; // 2 bytes
        System.out.println(s);

        char ch = 'a'; // 2 bytes ['a' 'b' 'c' '#' '%']
        System.out.println(ch);

        boolean var = true; // true, false
        System.out.println(var);

        float price = 10.5f; // 4 bytes
        System.out.println(price);

        double per = 11.234; // 8 bytes
        System.out.println(per);

        int age = 21; // 4 bytes
        System.out.println(age);

        long num = 12314; // 8 bytes
        System.out.println(num);
    }
}


// **Primitive**
// byte
// short
// char
// boolean
// int
// long
// float
// double

// **Non-Primitive**

// String
// Array
// Class
// Object
// Interface