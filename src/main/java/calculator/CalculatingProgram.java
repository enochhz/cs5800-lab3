package calculator;

public class CalculatingProgram {

    public int calculate(int num1, int num2, Character operation) {
        switch(operation) {
            case '+': 
                return add(num1, num2);
            case '-': 
                return subtract(num1, num2);
            case '*': 
                return multiply(num1, num2);
            case '/': 
                return divide(num1, num2);
            case '%': 
                return modulus(num1, num2);
            default:
                throw new IllegalArgumentException("The Operation is not valid");
        }
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Can not divid by zero!");
        }
        return num1 / num2;
    }

    private int modulus(int num1, int num2) {
        return num1 % num2;
    }
}