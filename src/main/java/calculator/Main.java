package calculator;

public class Main {
    
    public static void main(String[] args) {
        User user = new User();
        Calculator calculator = new Calculator();
        user.start(calculator);
    }
}