package com.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 32;
        int b = 7;
        
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println();
        
        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
    }
}