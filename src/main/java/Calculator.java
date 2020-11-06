public class Calculator {

    int a;
    int b;

    public int addition(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    public int substraction(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sum = calculator.addition(10, 6);
        System.out.println("Addition of: " + calculator.getA() + " + " + calculator.getB() + " = " + sum);
        int substaction = calculator.substraction(37, 26);
        System.out.println("Substraction of: " + calculator.getA() + " - " + calculator.getB() + " = " + substaction);

    }
}
