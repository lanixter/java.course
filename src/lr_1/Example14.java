package lr_1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();
        int previousNumber = number - 1;
        int nextNumber = number + 1;
        int the_square_of_the_sum = (previousNumber + number + nextNumber) * (previousNumber + number + nextNumber);
        System.out.println("Последовательность чисел: " + previousNumber + ", " + number + ", " + nextNumber + ", " + the_square_of_the_sum);
    }
}
