package lr3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int count = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;

        System.out.println("Последовательность чисел Фибоначчи:");

        System.out.print(firstNumber + " " + secondNumber + " ");

        for (int i = 3; i <= count; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");

            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}

