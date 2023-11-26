package lr_1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int currentyear = 2023;
        System.out.println("Введите Ваше имя: ");
        String name = in.nextLine();
        System.out.println("Введите Ваш год рождения: ");
        int year_brd = in.nextInt();
        int age = currentyear - year_brd;

        System.out.println("Вас зовут: " + name + " и ваш возраст " + age + "г.");
    }

}