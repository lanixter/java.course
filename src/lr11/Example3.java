package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        // Задаем строку в коде
        String inputString = "Напишите функцию, Которая принимает на вход список строк и Возвращает новый список, Содержащий только те строки, которые Начинаются с большой буквы.";

        // Разделяем строку на части
        String[] splitStrings = inputString.split(" ");

        // Преобразуем массив в список
        List<String> inputList = new ArrayList<>();
        for (String str : splitStrings) {
            inputList.add(str);
        }

        // Получаем список строк, начинающихся с большой буквы
        List<String> capitalizedList = getCapitalizedStrings(inputList);

        // Выводим результат
        System.out.println("Исходная строка: " + inputString);
        System.out.println("Строки, начинающиеся с большой буквы:");
        for (String str : capitalizedList) {
            System.out.println(str);
        }
    }

    public static List<String> getCapitalizedStrings(List<String> strings) {
        List<String> capitalizedList = new ArrayList<>();

        for (String str : strings) {
            if (!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                capitalizedList.add(str);
            }
        }

        return capitalizedList;
    }
}
