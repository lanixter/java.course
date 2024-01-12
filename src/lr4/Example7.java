package lr4;

public class Example7 { public static void main(String[] args) {
    int height = 4;
    int width = 5;

    int[][] snakeArray = new int[height][width];
    fillSnakeArray(snakeArray);

    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            System.out.print(snakeArray[i][j] + "\t");
        }
        System.out.println();
    }
}
private static void fillSnakeArray(int[][] array) {
        int value = 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = value++;
                }
            } else {

                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }
    }
}
