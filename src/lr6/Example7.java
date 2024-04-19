package lr6;


import java.util.Arrays;


public class Example7 {
    public static int[] convertToAsciiArray(char[] charArray) {
        int[] asciiArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            asciiArray[i] = (int) charArray[i];
        }
        return asciiArray;
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        int[] asciiArray = convertToAsciiArray(charArray);
        System.out.println("Результат: " + Arrays.toString(asciiArray));
    }
}
