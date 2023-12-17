package lr3;

public class Example8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char letter = 'B';

        for (int i = 0; i < 10; i++) {

            if (letter == 'A' || letter == 'E' || letter == 'I') {
                letter++;
            }

            letters[i] = letter;
            letter++;
        }

        for (char c : letters) {
            System.out.println(c);
        }
    }
}
