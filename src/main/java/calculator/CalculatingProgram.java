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

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int modulus(int num1, int num2) {
        return num1 % num2;
    }
}