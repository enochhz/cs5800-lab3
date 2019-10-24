package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import calculator.Calculator;

public class CalculatorTests {

    @Test
    public void testStartCalculator() {
        Calculator calculator = new Calculator();
        calculator.start();
        fail();
    }

}