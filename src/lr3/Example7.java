package lr3;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];

        char letter = 'a';
        for (int i = 0; i < size; i++) {
            array[i] = letter;
            letter += 2;
        }

        System.out.println("Прямой порядок:");
        for (char element : array) {
            System.out.print(element + " ");
        }

        System.out.println("\nОбратный порядок:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}
