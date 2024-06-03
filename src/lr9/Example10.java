package lr9;



import java.util.*;
import java.util.concurrent.TimeUnit;

public class Example10 {

    private static final int NUM_ELEMENTS = 11_000_000;

    public static void main(String[] args) {
        testArrayList();
        testArrayDeque();
        testSortedMap();
    }

    private static void testArrayList() {
        List<Long> list = new ArrayList<>();
        long start, end;


        for (long i = 0; i < NUM_ELEMENTS; i++) {
            list.add(i);
        }


        start = System.nanoTime();
        list.remove(0);
        end = System.nanoTime();
        System.out.printf("ArrayList remove (beginning): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));


        start = System.nanoTime();
        list.remove(NUM_ELEMENTS / 2);
        end = System.nanoTime();
        System.out.printf("ArrayList remove (middle): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));


        start = System.nanoTime();
        list.remove(list.size() - 1);
        end = System.nanoTime();
        System.out.printf("ArrayList remove (end): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));
    }

    private static void testArrayDeque() {
        Deque<Long> deque = new ArrayDeque<>();
        long start, end;


        for (long i = 0; i < NUM_ELEMENTS; i++) {
            deque.addLast(i);
        }


        start = System.nanoTime();
        deque.removeFirst();
        end = System.nanoTime();
        System.out.printf("ArrayDeque remove (beginning): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));


        Iterator<Long> it = deque.iterator();
        for (int i = 0; i < NUM_ELEMENTS / 2 - 1; i++) {
            it.next();
        }
        start = System.nanoTime();
        it.next();
        it.remove();
        end = System.nanoTime();
        System.out.printf("ArrayDeque remove (middle): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));


        start = System.nanoTime();
        deque.removeLast();
        end = System.nanoTime();
        System.out.printf("ArrayDeque remove (end): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));
    }

    private static void testSortedMap() {
        SortedMap<Long, Long> map = new TreeMap<>();
        long start, end;


        for (long i = 0; i < NUM_ELEMENTS; i++) {
            map.put(i, i);
        }


        start = System.nanoTime();
        map.remove(map.firstKey());
        end = System.nanoTime();
        System.out.printf("SortedMap remove (beginning): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));


        start = System.nanoTime();
        map.remove(NUM_ELEMENTS / 2L);
        end = System.nanoTime();
        System.out.printf("SortedMap remove (middle): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));


        start = System.nanoTime();
        map.remove(map.lastKey());
        end = System.nanoTime();
        System.out.printf("SortedMap remove (end): %d ms%n", TimeUnit.NANOSECONDS.toMillis(end - start));
    }
}