class Calculator {
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

    public int calculate(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

public class Operator {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("The sum of two numbers :" + obj.calculate(5, 5));
        System.out.println("The sum of two decimals :" + obj.calculate(5.5, 6.5));
        System.out.println("The sum of three numbers :" + obj.calculate(5, 5, 10));
    }
}
