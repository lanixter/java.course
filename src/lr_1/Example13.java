package lr_1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите перое число для вычисления суммы: ");
        int frst_number = in.nextInt();
        System.out.println("Введите второе число для вычисления суммы: ");
        int scnd_number = in.nextInt();

        int total = frst_number + scnd_number;
        System.out.println("Сумма равна: " + total);


    }
}
