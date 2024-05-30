package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example4 {
    public static void main(String[] args) {
        // Генерируем список из 10 случайных чисел
        List<Integer> inputList = generateRandomNumbers(10);

        // Выводим исходный список
        System.out.println("Исходный список чисел: " + inputList);

        // Получаем список квадратов чисел
        List<Integer> squaredList = getSquaredNumbers(inputList);

        // Выводим список квадратов чисел
        System.out.println("Список квадратов чисел: " + squaredList);
    }

    public static List<Integer> generateRandomNumbers(int count) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(100)); // Генерируем случайное число от 0 до 99
        }
        return numbers;
    }

    public static List<Integer> getSquaredNumbers(List<Integer> numbers) {
        List<Integer> squaredList = new ArrayList<>();
        for (int number : numbers) {
            squaredList.add(number * number);
        }
        return squaredList;
    }
}

