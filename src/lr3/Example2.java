package lr3;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название дня недели: ");
            String input = scanner.nextLine();

            if (input.equals("понедельник")) {
                System.out.println(1);
            } else if (input.equals("вторник")) {
                System.out.println(2);
            } else if (input.equals("среда")) {
                System.out.println(3);
            } else if (input.equals("четверг")) {
                System.out.println(4);
            } else if (input.equals("пятница")) {
                System.out.println(5);
            } else if (input.equals("суббота")) {
                System.out.println(6);
            } else if (input.equals("воскресенье")) {
                System.out.println(7);
            } else {
                System.out.println("Такого дня недели нет");
            }


        }

    }

