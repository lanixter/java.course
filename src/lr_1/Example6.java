package lr_1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String Фамилия = in.nextLine();
        System.out.println("Введите Имя: ");
        String Имя = in.nextLine();
        System.out.println("Введите Отчество: ");
        String Отчество = in.nextLine();
        System.out.println("Hello");
        System.out.println(Фамилия);
        System.out.println(Имя);
        System.out.println(Отчество);
        in.close();
    }

    }
