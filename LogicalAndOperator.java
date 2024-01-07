package com.operators;

public class LogicalAndOperator {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = true;

        // Logical AND - TT
        boolean resultTT = condition1 && condition2;
        System.out.println("Logical AND (TT): " + resultTT);

        condition2 = false;

        // Logical AND - FT
        boolean resultFT = condition1 && condition2;
        System.out.println("Logical AND (FT): " + resultFT);

        condition1 = false;
        condition2 = true;

        // Logical AND - TF
        boolean resultTF = condition1 && condition2;
        System.out.println("Logical AND (TF): " + resultTF);

        condition2 = false;

        // Logical AND - FF
        boolean resultFF = condition1 && condition2;
        System.out.println("Logical AND (FF): " + resultFF);
    }
}