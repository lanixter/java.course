package lr4;

public class example3 {
    public static void main(String[] args) {
        int width = 5;
        int height = 10;

        int[][] rectangle = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rectangle[i][j] = 2;
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}