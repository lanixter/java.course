package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    // Функция, которая фильтрует числа, которые меньше заданного значения
    public static List<Integer> filterLessThan(List<Integer> inputList, int threshold) {
        List<Integer> filteredList = new ArrayList<>();

        for (Integer num : inputList) {
            if (num < threshold) {
                filteredList.add(num);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия Scanner
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
            System.out.println("Введите значение для фильтрации (меньше которого числа должны быть в списке):");
            int threshold = scanner.nextInt();

            // Вызов функции и получение результата
            List<Integer> result = filterLessThan(inputList, threshold);

            // Вывод результата на консоль
            System.out.println("Новый список: " + result);
        } // Scanner будет автоматически закрыт здесь
    }
}
