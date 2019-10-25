package calculator;

import java.util.Scanner;

public class Calculator {

    private boolean powerOn;
    private Scanner scanner;
    private CalculatingProgram calculatingProgram;

    private int[] numbers;
    private Character operation;
    private int output;

    public Calculator() {
        powerOn = true;
        calculatingProgram = new CalculatingProgram();
        scanner = new Scanner(System.in);
        numbers = new int[2];
    }

    public void start() {
        System.out.println("Welcome!");
        while (powerOn) {
            askForInput();
            askForOperation();
            startCalculation();
            askForContinuation();
        }
        System.out.println("Thank you for playing :)");
    }

    private void askForInput() {
        System.out.print("Please enter two numbers split with space(ex:134 443): ");
        String stringInput = scanner.nextLine();
        String[] stringArray = stringInput.split(" ");
        if (stringArray.length == 2) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(stringArray[i]);
            }
        } else {
            System.out.println("You must enter exactly two numbers!");
            askForInput();
        }
    }

    private void askForOperation() {
        System.out.print("Please input your operations (+, -, *, /, %): ");
        String operationInput = scanner.nextLine().trim();
        if (operationInput.equals("+") || operationInput.equals("-") || operationInput.equals("*")
            || operationInput.equals("/") || operationInput.equals("%")) {
                this.operation = operationInput.charAt(0);
        } else {
            System.out.printf("Illegal Operation: %s\n", operationInput);
            askForOperation();
        }
    }

    private void startCalculation() {
        try {
            output = calculatingProgram.calculate(numbers[0], numbers[1], operation);
            System.out.printf("The output is %s.\n", this.output);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private void askForContinuation() {
        System.out.print("Do you want to continue(Y or N): ");
        String answer = scanner.nextLine().trim().toLowerCase();
        if (answer.equals("y")) {
            return;
        } else if (answer.equals("n")) {
            this.powerOn = false;
        } else {
            System.out.println("Invalid input...");
            askForContinuation();
        }
    }

}