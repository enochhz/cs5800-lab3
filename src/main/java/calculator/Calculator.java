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
            calculationInstruction();
            askForContinuation();
        }
        System.out.println("Thank you for playing :)");
    }

    private void calculationInstruction() {
        askForInput();
        askForOperation();
        startCalculation();
    }

    public void shutdown() {
        this.powerOn = false;
    }

    private void askForInput() {
        System.out.print("Please enter two integer split with space(ex:134 443): ");
        String stringInput = scanner.nextLine();
        String[] stringArray = stringInput.split(" ");
        String error = "";
        if (stringArray.length != 2) {
            error = "You must enter exactly two numbers!";
        } else {
            for (int i = 0; i < 2; i++) {
                try {
                    numbers[i] = Integer.parseInt(stringArray[i]);
                } catch(Exception e) {
                    error = e.toString();
                    break;
                }
            }
        }
        if (!error.equals("")) {
            System.out.println(error);
            askForInput();
        }
    }

    private void askForOperation() {
        System.out.print("Please input one operation (+, -, *, /, %): ");
        String operationInput = scanner.nextLine().trim();
        this.operation = operationInput.charAt(0);
    }

    private void startCalculation() {
        try {
            output = calculatingProgram.calculate(numbers[0], numbers[1], operation);
            System.out.printf("The output is %s.\n", this.output);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            calculationInstruction();
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            askForOperation();
            startCalculation();
        }
    }

    private void askForContinuation() {
        System.out.print("Do you want to continue(Y or N): ");
        String answer = scanner.nextLine().trim().toLowerCase();
        if (answer.equals("y")) {
            return;
        } else if (answer.equals("n")) {
            this.shutdown();
        } else {
            System.out.println("Invalid input!");
            askForContinuation();
        }
    }

}