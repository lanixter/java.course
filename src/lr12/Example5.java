package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example5 {
    public static void main(String[] args) {
        // Пример массива
        int[] array = {1, 5, 3, 19, 8, 7, 6, 12, 18, 9, 14, 16};

        // Определяем количество потоков
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of threads: " + numThreads);

        // Создаем пул потоков
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Длина подмассива для каждого потока
        int chunkSize = (int) Math.ceil(array.length / (double) numThreads);

        // Список задач для выполнения
        List<Future<Integer>> futures = new ArrayList<>();

        // Создаем и запускаем задачи
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, array.length);
            futures.add(executor.submit(new MaxFinder(array, start, end)));
        }

        // Ожидаем завершения всех задач и находим максимальное значение
        int max = Integer.MIN_VALUE;
        try {
            for (Future<Integer> future : futures) {
                max = Math.max(max, future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Закрываем пул потоков
        executor.shutdown();

        // Выводим результат
        System.out.println("Maximum value: " + max);
    }
}

// Класс, реализующий Callable, для поиска максимального значения в подмассиве
class MaxFinder implements Callable<Integer> {
    private final int[] array;
    private final int start;
    private final int end;

    public MaxFinder(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
