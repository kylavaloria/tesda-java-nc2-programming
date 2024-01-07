package com.operators;

public class UnaryOperators {
        public static void main(String[] args) {
        // Increment
        int x = 5;
        System.out.println("Value of x: " + x);
        x++;
        System.out.println("After incrementing: " + x);
        System.out.println();
        
        // Decrement
        int y = 8;
        System.out.println("Value of y: " + y);
        y--;
        System.out.println("After decrementing: " + y);
        System.out.println();

        // Logical NOT
        boolean flag = true;
        System.out.println("Value of flag: " + flag);
        flag = !flag;
        System.out.println("After logical NOT: " + flag);
        System.out.println();
    }
}