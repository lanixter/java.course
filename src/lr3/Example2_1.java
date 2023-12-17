package lr3;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day = scanner.nextLine();
        int daynumber;

        switch(day) {
            case "Понедельник":
            daynumber = 1;
            break;

            case "Вторник":
                daynumber = 2;
                break;

            case "Среда":
                daynumber = 3;
                break;

            case "Четверг":
                daynumber = 4;
                break;

            case "Пятница":
                daynumber = 5;
                break;

            case "Суббота":
                daynumber = 6;
                break;

            case "Воскресенье":
                daynumber = 7;
                break;

            default:
                System.out.println("Такого дня нет");
                return;


        }
        System.out.println("Порядковый номер дня в неделе: " + daynumber);

    }
}