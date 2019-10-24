package calculator;

import java.util.Scanner;

public class Calculator {

    private String input;
    private String operator;
    private int output;
    private String message = "";
    private CalculatingProgram calculatingProgram;

    public void start() {
        displayWelcomeMessage();
        displayInputPromptMessage();
    }

    private void displayWelcomeMessage() {
        System.out.println("Welcome!");
    }

    private void displayInputPromptMessage() {
        System.out.print("Please enter two numbers split with space(ex:134 443): ");
        Scanner in = new Scanner(System.in);
        this.input = in.nextLine();
    }

    public String getInput() {
        return this.input;
    }

    public void shutdown() {

    }

}