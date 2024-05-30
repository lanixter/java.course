package lr12;

public class Example3 {
    public static void main(String[] args) {
        // Создаем и запускаем первый поток для четных чисел
        Thread evenThread = new Thread(new EvenNumberPrinter());
        evenThread.start();

        // Создаем и запускаем второй поток для нечетных чисел
        Thread oddThread = new Thread(new OddNumberPrinter());
        oddThread.start();
    }
}

// Класс, реализующий Runnable, для вывода четных чисел от 1 до 10
class EvenNumberPrinter implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Четное: " + i);
                Thread.sleep(500); // Задержка для демонстрации работы потоков
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Класс, реализующий Runnable, для вывода нечетных чисел от 1 до 10
class OddNumberPrinter implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Нечетное: " + i);
                Thread.sleep(500); // Задержка для демонстрации работы потоков
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
