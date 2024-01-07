package com.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // Assignment
        int c = a;
        System.out.println("Value of c: " + c);
        System.out.println();

        // Compound Assignment
        c += b;
        System.out.println("c += b: " + c);

        c -= b;
        System.out.println("c -= b: " + c);

        c *= b;
        System.out.println("c *= b: " + c);

        c /= b;
        System.out.println("c /= b: " + c);

        c %= b;
        System.out.println("c %= b: " + c);
    }
}
