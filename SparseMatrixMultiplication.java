/*
 *[8]  Given two sparse matrices mat1 of size m x k and mat2 of size k x n, return
 * the result of mat1 x mat2. You may assume that multiplication is always
 * possible. Input:** mat1 = [[1,0,0],[-1,0,3]], mat2 =
 * [[7,0,0],[0,0,0],[0,0,1]]
 ** 
 * Output:**
 * 
 * [[7,0,0],[-7,0,3]]
 */

public class SparseMatrixMultiplication {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;    // Number of rows in mat1
        int k = mat1[0].length; // Number of columns in mat1
        int n = mat2[0].length; // Number of columns in mat2

        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    if (mat1[i][l] != 0 && mat2[l][j] != 0) {
                        result[i][j] += mat1[i][l] * mat2[l][j];
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};

        int[][] result = multiply(mat1, mat2);

        System.out.println("Result:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
