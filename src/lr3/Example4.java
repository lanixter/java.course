package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int frstnum = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int scndnum = scanner.nextInt();

        int start = Math.min(frstnum, scndnum);
        int end = Math.max(frstnum, scndnum);

        System.out.println("Целые числа в диапазоне от " + start + " до " + end + ":");

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
