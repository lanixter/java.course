package lr_1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите перое число для вычисления суммы и разности: ");
        int frst_number = in.nextInt();
        System.out.println("Введите второе число для вычисления суммы и разности: ");
        int scnd_number = in.nextInt();

        int sum = frst_number + scnd_number;
        int difference = frst_number - scnd_number;

        System.out.println("Сумма равна: " + sum + ", " + "Разность равна: " + difference);}
}
