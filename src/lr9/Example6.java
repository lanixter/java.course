package lr9;

import java.util.Scanner;

public class Example6 {


    public static String toBinary(int n) {

        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        }


        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();


        scanner.close();


        String binaryRepresentation = toBinary(number);
        System.out.println("Двоичное представление числа: " + binaryRepresentation);
    }
}
