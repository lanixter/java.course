package lr12;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Создаем и запускаем поток, передавая номер потока в конструктор
            Thread thread = new Thread(new NumberedThread(i));
            thread.start();
        }
    }
}

// Класс, реализующий Runnable, который выводит на экран номер потока
class NumberedThread implements Runnable {
    private final int threadNumber;

    public NumberedThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread number: " + threadNumber);
    }
}
