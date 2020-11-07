package com.kodilla;

public class Calculator {

    public static void main(String[] args) {

        MathematicalOperations calculator = new MathematicalOperations(60, 10);
        calculator.addition();
        calculator.substraction();
        calculator.multiplication();

        System.out.println("Addition of " + calculator.getA() + " & " + calculator.getB() + " is " + calculator.addition());
        System.out.println("Substraction of " + calculator.getA() + " & " + calculator.getB() + " is " + calculator.substraction());
        System.out.println("Multipliaction of " + calculator.getA() + " & " + calculator.getB() + " is " + calculator.multiplication());

    }

}

