package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example5 {
    // Функция, которая фильтрует строки, содержащие заданную подстроку
    public static List<String> filterStrings(List<String> inputList, String substring) {
        List<String> filteredList = new ArrayList<>();

        for (String str : inputList) {
            if (str.contains(substring)) {
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите строки (введите 'stop' для завершения ввода):");
            List<String> inputList = new ArrayList<>();
            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("stop")) {
                    break;
                }
                inputList.add(line);
            }

            // Ввод подстроки для поиска
            System.out.println("Введите подстроку для поиска:");
            String substring = scanner.nextLine();

            // Вызов функции и получение результата
            List<String> result = filterStrings(inputList, substring);

            // Вывод результата на консоль
            System.out.println("Новый список: " + result);
        }
    }
}