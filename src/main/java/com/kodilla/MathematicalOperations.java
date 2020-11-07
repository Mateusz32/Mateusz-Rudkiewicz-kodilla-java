package com.kodilla;

public class MathematicalOperations {
    private int a;
    private int b;

    MathematicalOperations(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int addition() {
        return a + b;
    }

    public int substraction() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
