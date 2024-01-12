package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {

        int width = 3;
        int height = 5;

        int[][] Array = new int[width][height];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Array[i][j] = random.nextInt(100);
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
        int [][] Array2 = new int[height][width];
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++) {
                Array2[j][i] = Array[i][j];
            }
        }

        System.out.println("\nМассив после перестановки:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(Array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
