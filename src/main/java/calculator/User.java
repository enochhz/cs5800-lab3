package calculator;

public class User {

    public static void main(String[] args) {
        User user = new User();
        Calculator calculator = new Calculator();
        user.start(calculator);
    }

    public void start(Calculator calculator) {
        calculator.start();
    }
}