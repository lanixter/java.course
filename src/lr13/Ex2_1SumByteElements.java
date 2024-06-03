package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_1SumByteElements {
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
                System.out.println("Ошибка ввода: введено не число");
                e.printStackTrace();
                return;
            } catch (NegativeArraySizeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                return;
            }

            byte[] numbers = new byte[n];
            System.out.println("Введите элементы массива:");

            try {
                for (int i = 0; i < n; i++) {
                    int input = scanner.nextInt();
                    if (input < Byte.MIN_VALUE || input > Byte.MAX_VALUE) {
                        throw new ArithmeticException("Ошибка ввода: значение за пределами диапазона типа byte");
                    }
                    numbers[i] = (byte) input;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода: введено не число");
                e.printStackTrace();
                return;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                return;
            }

            int sum = 0;

            for (byte num : numbers) {
                sum += num;
            }

            System.out.println("Сумма элементов типа byte: " + sum);
        }
    }
}
