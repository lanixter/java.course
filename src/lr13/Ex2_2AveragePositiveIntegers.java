package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_2AveragePositiveIntegers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов:");
            int n;

            try {
                n = scanner.nextInt();
                if (n < 0) {
                    throw new NegativeArraySizeException("Размер массива не может быть отрицательным");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода: введено не число.");
                return;
            } catch (NegativeArraySizeException e) {
                System.out.println(e.getMessage());
                return;
            }

            int[] numbers = new int[n];
            System.out.println("Введите элементы массива:");

            try {
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода: введено не число.");
                return;
            }

            int sum = 0;
            int count = 0;

            for (int num : numbers) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Положительные элементы отсутствуют.");
            } else {
                double average = (double) sum / count;
                System.out.println("Среднее значение положительных элементов: " + average);
            }
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Завершение работы программы для вычисления среднего значения положительных чисел.");
        }
    }
}