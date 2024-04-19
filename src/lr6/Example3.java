package lr6;


    public class Example3 {
        public static int findMax(int... numbers) {
            int max = Integer.MIN_VALUE;
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        public static int findMin(int... numbers) {
            int min = Integer.MAX_VALUE;
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }

        public static double findAverage(int... numbers) {
            if (numbers.length == 0) {
                return 0.0;
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }

        public static void main(String[] args) {
            int[] array = {5, 10, 3, 8, 15};
            System.out.println("Maximum: " + findMax(array));
            System.out.println("Minimum: " + findMin(array));
            System.out.println("Average: " + findAverage(array));
        }
    }

