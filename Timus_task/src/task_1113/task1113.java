package task_1113;

import java.util.Scanner;

public class task1113 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int a;
        double o = 0, w = 0, d;

        for (a = 1; ; a++) {
            d = (double) m / (double) (a * 2 - 1);
            if (w + d >= n)
                break;
            w += d;
            o += m;
        }

        d = (double) (n) - w;
        o += d * (a * 2 - 1);

        System.out.println((int) Math.ceil(o));
    }
}
