package lr6;


import java.util.Scanner;

public class Example5 {
    public static int calculateSquareSum(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Сумма квадратов натуральных чисел до " + n + " равна " + calculateSquareSum(n));
    }
}

