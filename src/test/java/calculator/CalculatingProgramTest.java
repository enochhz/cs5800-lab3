package calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        try {
            Method addMethod = CalculatingProgram.class.getDeclaredMethod("add");
            addMethod.setAccessible(true);
            int result = (int) addMethod.invoke(calculatingProgram, 1, 2);
        assertTrue(result == 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSubtractOperation() {
        int result = calculatingProgram.calculate(10, 1, '-');
        assertTrue(result == 9);
    }

    @Test
    public void testMultiplyOperation() {
        int result = calculatingProgram.multiply(7, 9);
        assertTrue(result == 63);
    }

    @Test
    public void testDivideOperation() {
        int result = calculatingProgram.divide(15, 3);
        assertTrue(result == 5);
    }

    @Test
    public void testModulusOperation() {
        int result = calculatingProgram.modulus(10, 3);
        assertTrue(result == 1);
    }
}