package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Размер массива должен быть положительным числом.");
                return;
            }

            int[] array = new int[size];

            System.out.println("Числовой массив, где элементы при делении на 5 дают в остатке 2:");

            for (int i = 0; i < size; i++) {
                array[i] = 2 + 5 * i;
                System.out.print(array[i] + " ");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите корректное целое число.");
        }
    }
}
