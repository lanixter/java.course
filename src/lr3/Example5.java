package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите количество чисел для суммирования: ");
            int count = scanner.nextInt();

            int sum = 0;
            int numbersFound = 0;

            System.out.println("Числа, удовлетворяющие критериям, и их сумма:");

            for (int i = 1; numbersFound < count; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.print(i + " ");
                    sum += i;
                    numbersFound++;
                }
            }

            System.out.println("\nСумма чисел: " + sum);
        }
    }

