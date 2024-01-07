package com.operators;

public class LogicalOrOperator {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = true;

        // Logical OR - TT
        boolean resultTT = condition1 || condition2;
        System.out.println("Logical OR (TT): " + resultTT);

        condition2 = false;

        // Logical OR - TF
        boolean resultTF = condition1 || condition2;
        System.out.println("Logical OR (TF): " + resultTF);

        condition1 = false;
        condition2 = true;

        // Logical OR - FT
        boolean resultFT = condition1 || condition2;
        System.out.println("Logical OR (FT): " + resultFT);

        condition2 = false;

        // Logical OR - FF
        boolean resultFF = condition1 || condition2;
        System.out.println("Logical OR (FF): " + resultFF);
    }
}