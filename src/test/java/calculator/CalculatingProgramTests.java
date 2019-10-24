package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import calculator.CalculatingProgram;

public class CalculatingProgramTests {

    @Test
    public void testAddTwoNumbers() {
        CalculatingProgram calculatingProgram = new CalculatingProgram();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int result = calculatingProgram.addNumbers(nums);
        assertTrue(result == 15);
    }

    @Test
    public void testSubtractTwoNumbers() {
        assertTrue(false);
    }
}