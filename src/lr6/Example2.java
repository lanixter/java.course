package lr6;

public class Example2 {
    private static int count = 0;

    public static void displayAndIncrement() {
        System.out.println("Current count: " + count);
        count++;
    }

    public static void main(String[] args) {

        displayAndIncrement();
        displayAndIncrement();
        displayAndIncrement();
    }
}
