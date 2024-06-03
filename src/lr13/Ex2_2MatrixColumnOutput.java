package lr13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_2MatrixColumnOutput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество строк и столбцов:");
            int rows, cols;

            try {
                rows = scanner.nextInt();
                cols = scanner.nextInt();
                if (rows < 0 || cols < 0) {
                    throw new NegativeArraySizeException("Размер матрицы не может быть отрицательным");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода: введено не число.");
                return;
            } catch (NegativeArraySizeException e) {
                System.out.println(e.getMessage());
                return;
            }

            int[][] matrix = new int[rows][cols];
            System.out.println("Введите элементы матрицы:");

            try {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода: введено не число.");
                return;
            }

            System.out.println("Введите номер столбца для вывода:");
            int colNum;

            try {
                colNum = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода: введено не число.");
                return;
            }

            if (colNum < 0 || colNum >= cols) {
                System.out.println("Нет столбца с таким номером.");
            } else {
                System.out.println("Столбец " + colNum + ":");
                for (int i = 0; i < rows; i++) {
                    System.out.println(matrix[i][colNum]);
                }
            }
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Завершение работы программы для вывода столбца из матрицы.");
        }
    }
}

