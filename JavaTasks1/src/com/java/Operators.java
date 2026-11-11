
package com.java;

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));

        // Logical Operators
        System.out.println("Logical AND: " + (a > 5 && b < 10));
        System.out.println("Logical OR: " + (a < 5 || b < 10));
        System.out.println("Logical NOT: " + !(a > b));

        // Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("After += : " + c);
        c -= 3;
        System.out.println("After -= : " + c);

        // Bitwise Operators
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));

        // Unary Operators
        int x = 5;
        System.out.println("Unary Plus: " + (+x));
        System.out.println("Unary Minus: " + (-x));
        System.out.println("Increment: " + (++x));
        System.out.println("Decrement: " + (--x));
    }
}