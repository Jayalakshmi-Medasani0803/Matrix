package com.copilot;

public class MatrixSpiralTraversal {
    public static void spiralTraverse() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row_start = 0;
        int column_start = 0;
        int row_end = matrix.length - 1;
        int column_end = matrix[0].length - 1;
        while (row_start <= row_end && column_start <= column_end) {
            for (int i = column_start; i <= column_end; i++) {
                System.out.print(matrix[row_start][i]);
            }
            row_start++;
            for (int i = row_start; i <= row_end; i++) {
                System.out.print(matrix[i][column_end]);
            }
            column_end--;
            for (int i = column_end; i >= column_start; i--) {
                System.out.print(matrix[row_end][i]);
            }
            row_end--;
            for (int i = row_end; i >= row_start; i--) {
                System.out.print(matrix[i][column_start]);
            }
            column_start++;
        }
    }
}
