package lr_1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int currentYear = 2023;
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        int year_of_birth = currentYear - age;

        System.out.println("Ваш год рождения: " + year_of_birth);
    }
}
