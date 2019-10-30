package calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import calculator.CalculatingProgram;

public class CalculatingProgramTest {

    CalculatingProgram calculatingProgram;

    @Before
    public void setup() {
        calculatingProgram = new CalculatingProgram();
    }

    @Test
    public void testAddOperation() {
        int result = calculatingProgram.calculate(1, 2, '+');
        assertTrue(result == 3);
    }

    @Test
    public void testSubtractOperation() {
        int result = calculatingProgram.calculate(10, 1, '-');
        assertTrue(result == 9);
    }

    @Test
    public void testMultiplyOperation() {
        int result = calculatingProgram.calculate(7, 9, '*');
        assertTrue(result == 63);
    }

    @Test
    public void testDivideOperation() {
        int result = calculatingProgram.calculate(15, 3, '/');
        assertTrue(result == 5);
    }

    @Test
    public void testModulusOperation() {
        int result = calculatingProgram.calculate(10, 3, '%');
        assertTrue(result == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperation() {
        calculatingProgram.calculate(10, 3, '0');
    }

    @Test(expected = ArithmeticException.class)
    public void textDivideByZeroException() {
        calculatingProgram.calculate(10, 0, '/');
    }
}