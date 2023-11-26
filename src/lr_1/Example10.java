package lr_1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int currentYear = 2023;
        System.out.println("Введите ваш год рождения: ");
        int year_brd = in.nextInt();
        int age = currentYear - year_brd;

        System.out.println("Ваш возраст: " + age);

    }
}
