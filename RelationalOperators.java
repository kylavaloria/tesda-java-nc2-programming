package com.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println();

        // Less than
        System.out.println("Is x less than y? " + (x < y));

        // Greater than
        System.out.println("Is x greater than y? " + (x > y));

        // Less than or equal to
        System.out.println("Is x less than or equal to y? " + (x <= y));

        // Greater than or equal to
        System.out.println("Is x greater than or equal to y? " + (x >= y));

        // Equal to
        System.out.println("Is x equal to y? " + (x == y));

        // Not equal to
        System.out.println("Is x not equal to y? " + (x != y));
    }
}