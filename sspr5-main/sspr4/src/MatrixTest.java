import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    @Test
    public void testFindMinAboveDiagonal_case1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double expected = 6.0; // Минимальный элемент выше главной диагонали
        double result = findMinAboveDiagonal(matrix);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMinAboveDiagonal_case2() {
        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        double expected = 0.0; // Минимальный элемент выше главной диагонали
        double result = findMinAboveDiagonal(matrix);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMinAboveDiagonal_case3() {
        int[][] matrix = {
                {5, 2},
                {3, 4}
        };
        double expected = 2.0; // Минимальный элемент выше главной диагонали
        double result = findMinAboveDiagonal(matrix);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMinAboveDiagonal_case4() {
        int[][] matrix = {
                {5}
        };
        double expected = Double.POSITIVE_INFINITY; // Нет элементов выше главной диагонали
        double result = findMinAboveDiagonal(matrix);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMinAboveDiagonal_case5() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        double expected = 7.0; // Минимальный элемент выше главной диагонали
        double result = findMinAboveDiagonal(matrix);
        assertEquals(expected, result, 0.001);
    }

    // Метод для поиска минимального элемента выше главной диагонали
    private double findMinAboveDiagonal(int[][] matrix) {
        double minAboveDiagonal = Double.POSITIVE_INFINITY; // Инициализируем с бесконечностью

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) { // j начинается с i + 1
                if (matrix[i][j] < minAboveDiagonal) {
                    minAboveDiagonal = matrix[i][j];
                }
            }
        }

        return minAboveDiagonal == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : minAboveDiagonal;
    }
}
