package lr9;


import java.util.ArrayList;
import java.util.List;

public class Example9_ArrayList {
        public static void main(String[] args) {
            int n = 10; // Количество человек
            List<Integer> people = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                people.add(i);
            }

            int index = 0;
            while (people.size() > 1) {
                index = (index + 1) % people.size();
                people.remove(index);
            }

            System.out.println("Оставшийся человек (ArrayList): " + people.get(0));
        }
    }
