package lr12;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example1 {
    public static void main(String[] args) {
        // Создаем первый поток
        Thread thread1 = new Thread(new TimePrinter(), "Thread-1");
        // Создаем второй поток
        Thread thread2 = new Thread(new TimePrinter(), "Thread-2");

        // Запускаем потоки
        thread1.start();
        thread2.start();

        // Ожидаем завершения потоков в течение 10 секунд
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Прерываем потоки после 10 секунд
        thread1.interrupt();
        thread2.interrupt();
    }
}

// Класс, реализующий Runnable, для вывода имени потока и текущего времени
class TimePrinter implements Runnable {
    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (!Thread.currentThread().isInterrupted()) {
            LocalTime now = LocalTime.now();
            System.out.println(Thread.currentThread().getName() + " - " + now.format(formatter));

            // Пауза в 1 секунду между выводами
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Прерывание потока, выходим из цикла
                Thread.currentThread().interrupt();
            }
        }
    }
}
