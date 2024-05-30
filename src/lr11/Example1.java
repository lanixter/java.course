package lr11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] inputArray = new int[size];


            Random random = new Random();
            for (int i = 0; i < size; i++) {
                inputArray[i] = random.nextInt(100);
            }


            System.out.print("Исходный массив: ");
            for (int num : inputArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            int[] evenNumbers = getEvenNumbers(inputArray);


            System.out.print("Массив четных чисел: ");
            for (int num : evenNumbers) {
                System.out.print(num + " ");
            }
        } finally {

            scanner.close();
        }
    }

    public static int[] getEvenNumbers(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }

        int[] evenArray = new int[evenList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            evenArray[i] = evenList.get(i);
        }

        return evenArray;
    }
}
