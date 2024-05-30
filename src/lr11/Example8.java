package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Example8 {
    // Функция, которая фильтрует числа, которые больше заданного значения
    public static List<Integer> filterGreaterThan(List<Integer> inputList, int threshold) {
        List<Integer> filteredList = new ArrayList<>();

        for (Integer num : inputList) {
            if (num > threshold) {
                filteredList.add(num);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Ввод размера списка
            System.out.println("Введите размер списка чисел:");
            int size = scanner.nextInt();

            // Генерация списка целых чисел
            List<Integer> inputList = new ArrayList<>();
            Random random = new Random();
            System.out.println("Исходный список чисел:");
            for (int i = 0; i < size; i++) {
                int number = random.nextInt(100); // Генерация случайного числа от 0 до 99
                inputList.add(number);
                System.out.print(number + " ");
            }
            System.out.println();

            // Ввод заданного значения
            System.out.println("Введите значение для фильтрации (больше которого числа должны быть в списке):");
            int threshold = scanner.nextInt();

            // Вызов функции и получение результата
            List<Integer> result = filterGreaterThan(inputList, threshold);

            // Вывод результата на консоль
            System.out.println("Новый список: " + result);
        }
    }
}
