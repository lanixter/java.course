package lr_1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();
        System.out.println("Введите количество дней в этом месяце: ");
        int days = in.nextInt();

        System.out.println(month + " содержит " + days + " дней.");

    }
}

