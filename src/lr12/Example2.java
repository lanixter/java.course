package lr12;

public class Example2 {
    public static void main(String[] args) {
        // Создаем и запускаем поток
        Thread numberPrinterThread = new Thread(new NumberPrinter());
        numberPrinterThread.start();
    }
}

// Класс, реализующий Runnable, для вывода чисел от 1 до 10 с задержкой в 1 секунду
class NumberPrinter implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000); // Задержка в 1 секунду
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
