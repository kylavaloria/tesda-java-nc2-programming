package com.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println();
        
        System.out.println("(x > y) ?");
        
        // Ternary Operator
        String result = (x > y) ? "x is greater" : "y is greater";
        System.out.println(result);
    }
}