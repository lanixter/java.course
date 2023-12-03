package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        int fourth_number = 0;
        if (number >= 1000 && number <= 9999) {
            fourth_number = (number / 1000) % 10;
            System.out.println(fourth_number + " тысяч в числе");
        }
        else {
            System.out.println("Введенное число не является четырехзначным.");
        }
    }
}


