package lr3;
import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {

        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }

}
