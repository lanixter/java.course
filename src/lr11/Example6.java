package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    // Функция, которая фильтрует числа, делящиеся на заданное число без остатка
    public static List<Integer> filterNumbers(List<Integer> inputList, int divisor) {
        List<Integer> filteredList = new ArrayList<>();

        for (Integer num : inputList) {
            if (num % divisor == 0) {
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

            // Ввод заданного числа
            System.out.println("Введите число для деления:");
            int divisor = scanner.nextInt();

            // Вызов функции и получение результата
            List<Integer> result = filterNumbers(inputList, divisor);

            // Вывод результата на консоль
            System.out.println("Новый список: " + result);
        }
    }
}