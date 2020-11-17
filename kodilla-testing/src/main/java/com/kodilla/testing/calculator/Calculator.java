package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;

    public int add() {
        return a + b;
    }

    public int substract() {
        return a - b;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {

        int x=3;
        int s=2;
        System.out.println(x/s);


    }

}
