package lr6;

import java.util.Arrays;

public class Example6 {
    public static int[] takeFirstNElements(int[] array, int n) {
        if (n >= array.length) {
            // Если n больше или равно длине массива, создаем копию исходного массива
            int[] copy = new int[array.length];
            System.arraycopy(array, 0, copy, 0, array.length);
            return copy;
        } else {
            // В противном случае создаем новый массив, содержащий первые n элементов исходного массива
            int[] result = new int[n];
            System.arraycopy(array, 0, result, 0, n);
            return result;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int n = 3;
        int[] resultArray = takeFirstNElements(originalArray, n);
        System.out.println("Результат: " + Arrays.toString(resultArray));
    }
}
