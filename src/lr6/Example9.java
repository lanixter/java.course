package lr6;

import java.util.Arrays;

public class Example9 {
    public static void swapPairs(char[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Исходный массив: " + Arrays.toString(charArray));
        swapPairs(charArray);
        System.out.println("Результат: " + Arrays.toString(charArray));
    }
}