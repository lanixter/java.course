package lr4;

import java.util.Random;
import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {

        int width = 5;
        int height = 5;

        int[][] Array = new int[width][height];
        initializeArray(Array);

        System.out.println("Исходный массив:");
        printArray(Array);

        Random random = new Random();
        int widthIndexToRemove = random.nextInt(width);
        int heightIndexToRemove = random.nextInt(height);

        int[][] newArray = removeRowAndColumn(Array, widthIndexToRemove, heightIndexToRemove);

        System.out.println("\nМассив после удаления строки " + widthIndexToRemove + " и столбца " + heightIndexToRemove + ":");
        printArray(newArray);
    }
    private static void initializeArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static int[][] removeRowAndColumn(int[][] array, int rowIndexToRemove, int colIndexToRemove) {
        int[][] newArray = new int[array.length - 1][array[0].length - 1];

        for (int i = 0, newRow = 0; i < array.length; i++) {
            if (i != rowIndexToRemove) {
                for (int j = 0, newCol = 0; j < array[0].length; j++) {
                    if (j != colIndexToRemove) {
                        newArray[newRow][newCol++] = array[i][j];
                    }
                }
                newRow++;
            }
        }

        return newArray;
    }
}
