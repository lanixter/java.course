package lr9;


import java.util.HashMap;
import java.util.Map;

public class Example8 {



        public static void main(String[] args) {

            HashMap<Integer, String> map = new HashMap<>();
            map.put(0, "zero");
            map.put(1, "one");
            map.put(2, "two");
            map.put(3, "three");
            map.put(4, "four");
            map.put(5, "five");
            map.put(6, "sixsix");
            map.put(7, "sevenseven");
            map.put(8, "eight");
            map.put(9, "nine");


            System.out.println("Строки, у которых ключ > 5:");
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getKey() > 5) {
                    System.out.println(entry.getValue());
                }
            }


            System.out.print("Строки, у которых ключ = 0: ");
            if (map.containsKey(0)) {
                System.out.println(map.get(0));
            } else {
                System.out.println("Нет ключа 0 в карте");
            }


            long product = 1;
            boolean found = false;
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().length() > 5) {
                    product *= entry.getKey();
                    found = true;
                }
            }

            if (found) {
                System.out.println("Произведение всех ключей, где длина строки > 5: " + product);
            } else {
                System.out.println("Нет строк с длиной больше 5");
            }
        }
    }






