package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example7 {
    // Функция, которая фильтрует строки, имеющие длину больше заданного значения
    public static List<String> filterByLength(List<String> inputList, int length) {
        List<String> filteredList = new ArrayList<>();

        for (String str : inputList) {
            if (str.length() > length) {
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Ввод списка строк пользователем
            List<String> inputList = new ArrayList<>();
            System.out.println("Введите строки (введите 'stop' для завершения ввода):");
            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("stop")) {
                    break;
                }
                inputList.add(line);
            }

            // Ввод заданного значения длины
            System.out.println("Введите значение длины:");
            int length = scanner.nextInt();

            // Вызов функции и получение результата
            List<String> result = filterByLength(inputList, length);

            // Вывод результата на консоль
            System.out.println("Новый список: " + result);
        }
    }
}
