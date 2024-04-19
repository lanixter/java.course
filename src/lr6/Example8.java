package lr6;

import java.util.Arrays;

public class Example8 {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Среднее значение: " + average);
    }
}