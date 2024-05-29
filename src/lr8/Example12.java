package lr8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example12 {
    public static void main(String[] args) {
        String inputFile = "input2.txt";
        String outputFile = "output2.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("[\\s.,:;!?]+");
                int count = 0;

                for (String word : words) {
                    if (startsWithConsonant(word)) {
                        writer.println("Строка " + lineNumber + ": " + word);
                        count++;
                    }
                }

                writer.println("Строка " + lineNumber + " содержит " + count + " слов(а) начинающихся с согласных букв.");
            }

            reader.close();
            writer.close();

            System.out.println("Программа успешно выполнена. Результат записан в файл " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean startsWithConsonant(String word) {
        Pattern pattern = Pattern.compile("^[бвгджзйклмнпрстфхцчшщ]");
        Matcher matcher = pattern.matcher(word.toLowerCase());
        return matcher.find();
    }
}