package lr_1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String day = in.nextLine();
        System.out.println("Введите название месяца: ");
        String month = in.nextLine();
        System.out.println("Введите дату: ");
        int data = in.nextInt();

        System.out.println("Сегодняшняя дата: "+ day + " " +  data + " " + month);

    }
}
