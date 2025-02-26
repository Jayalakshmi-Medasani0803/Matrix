package com.copilot;

public class MatrixTranspose {
    public static void transposeMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = matrix.length;
        int columns = matrix[0].length;
        //in case of printing
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //change actual matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //print matrix
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
