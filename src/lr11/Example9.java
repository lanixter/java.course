package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example9 {
    // Функция, которая фильтрует строки, содержащие только буквы
    public static List<String> filterAlphabeticStrings(List<String> inputList) {
        List<String> filteredList = new ArrayList<>();

        for (String str : inputList) {
            if (str.matches("[a-zA-Z]+")) { // Проверка, что строка содержит только буквы
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

            // Вызов функции и получение результата
            List<String> result = filterAlphabeticStrings(inputList);

            // Вывод результата на консоль
            System.out.println("Новый список: " + result);
        }
    }
}
