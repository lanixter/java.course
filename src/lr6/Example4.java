package lr6;


    public class Example4 {
        public static int calculateDoubleFactorial(int n) {
            if (n <= 0) {
                return 1;
            }
            int result = 1;
            for (int i = n; i >= 1; i -= 2) {
                result *= i;
            }
            return result;
        }

        public static void main(String[] args) {
            int number = 10;
            System.out.println(number + "!! = " + calculateDoubleFactorial(number));
        }
    }

