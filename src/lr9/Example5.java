package lr9;

public class Example5 {
    public static void m(int x) {

        System.out.println("Вывод m with x=" + x);

        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }


        System.out.println("вывод m with x=" + x);
    }

    public static void main(String[] args) {
        m(1);
    }
}