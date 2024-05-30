package lr11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Запрашиваем размер массивов
            System.out.print("Введите размер массивов: ");
            int size = scanner.nextInt();

            int[] array1 = new int[size];
            int[] array2 = new int[size];

            // Генерируем случайные элементы для первого массива
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array1[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
            }

            // Генерируем случайные элементы для второго массива
            for (int i = 0; i < size; i++) {
                array2[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
            }

            // Выводим первый сгенерированный массив
            System.out.print("Первый массив: ");
            for (int num : array1) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Выводим второй сгенерированный массив
            System.out.print("Второй массив: ");
            for (int num : array2) {
                System.out.print(num + " ");
            }
            System.out.println();

            int[] intersectionArray = getIntersection(array1, array2);

            // Выводим массив пересечения
            System.out.print("Элементы, присутствующие в обоих массивах: ");
            for (int num : intersectionArray) {
                System.out.print(num + " ");
            }
        } finally {
            // Закрываем Scanner для предотвращения утечки ресурсов
            scanner.close();
        }
    }

    public static int[] getIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        int[] resultArray = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            resultArray[i++] = num;
        }

        return resultArray;
    }
}
