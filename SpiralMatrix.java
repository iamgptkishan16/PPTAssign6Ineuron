/*
 *[7] Given a positive integer n, generate an n x n matrix filled with elements
 * from 1 to n2 in spiral order. Input:** n = 3
 ** 
 * Output:** [[1,2,3],[8,9,4],[7,6,5]]
 */


public class SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;
        int row = 0, col = 0;
        String direction = "right";

        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = value;
            value++;

            if (direction.equals("right")) {
                if (col < n - 1 && matrix[row][col + 1] == 0) {
                    col++;
                } else {
                    row++;
                    direction = "down";
                }
            } else if (direction.equals("down")) {
                if (row < n - 1 && matrix[row + 1][col] == 0) {
                    row++;
                } else {
                    col--;
                    direction = "left";
                }
            } else if (direction.equals("left")) {
                if (col > 0 && matrix[row][col - 1] == 0) {
                    col--;
                } else {
                    row--;
                    direction = "up";
                }
            } else if (direction.equals("up")) {
                if (row > 0 && matrix[row - 1][col] == 0) {
                    row--;
                } else {
                    col++;
                    direction = "right";
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);

        System.out.println("Generated matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
