
import java.util.*;

public class TwoDArrays {

    public static void spiralMatrix(int matrix[][]) {
        int startcol = 0;
        int startrow = 0;
        int endcol = matrix[0].length - 1;
        int endrow = matrix.length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {

                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {

                System.out.print(matrix[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }

        System.out.println("");
    }

    public static void diagnalMatrixBruteForce(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];

                } else if (i + j == matrix.length - 1) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("The sum of matrix :" + sum);
    }

    public static void diagnoal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
            if (i != matrix.length - i - 1) {
                sum = sum + matrix[i][matrix.length - i - 1];
            }
        }
        System.out.println(sum);

    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at:(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("not found ");
        return false;
    }

    public static void sumOfMatrix(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("sim  is " + sum);
    }

    public static void repeatationOf2DArray(int array[][]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 8) {
                    count = count + 1;
                }
            }
        }
        System.out.println("8 is repeated " + count + " times");
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transpose(int matrix[][]) {
        int row = 4;
        int col = 4;
        printMatrix(matrix);
        int transpose[][] = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("the  Transposed matrix is  ");
        printMatrix(transpose);
    }

    public static void main(String[] args) {
        // creation2DArrays();
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        // spiralMatrix(matrix);
        // diagnalMatrixBruteForce(matrix);
        // diagnoal(matrix);
        // staircaseSearch(matrix, 50);
        // sumOfMatrix(matrix);
        // repeatationOf2DArray(array);
        transpose(matrix);
    }
}
