package lr6;

import java.util.Arrays;

public class Example10 {
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            return new int[]{0, 0};
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] result = findMinMax(5, 3, 9, 1, 7);
        System.out.println("Результат: " + Arrays.toString(result));
    }
}