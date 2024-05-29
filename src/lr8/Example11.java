package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Example11 {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Чтение данных из исходного файла
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath), StandardCharsets.UTF_8));
            List<String> lines = new ArrayList<>();
            List<Double> numbers = new ArrayList<>();

            // Чтение двух строк
            lines.add(reader.readLine());
            lines.add(reader.readLine());

            // Чтение пяти чисел типа double
            for (int i = 0; i < 5; i++) {
                String line = reader.readLine();
                if (line != null) {
                    double number = Double.parseDouble(line);
                    numbers.add(number);
                }
            }

            reader.close();

            // Запись данных в результирующий файл
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilePath), StandardCharsets.UTF_8));

            // Запись второй строки
            writer.write(lines.get(1));
            writer.newLine();

            // Запись положительных чисел
            for (double number : numbers) {
                if (number > 0) {
                    writer.write(Double.toString(number));
                    writer.newLine();
                }
            }

            writer.close();
            System.out.println("Данные успешно записаны в файл " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }
}