package task_1264;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = consoleReader.readLine().split(" ");
        consoleReader.close();

        System.out.println(Integer.parseInt(input[0]) * (1 + Integer.parseInt(input[1])));
    }
}
