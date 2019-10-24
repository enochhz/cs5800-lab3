package calculator;

public class CalculatingProgram {

    public int addNumbers(int[] nums) {
        int result = 0;
        for (int num: nums) {
            result += num;
        }
        return result;
    }

}