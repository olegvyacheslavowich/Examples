package kz.karpenko.turn;

import java.util.Random;

/**
 * Created by Олег on 26.01.2017.
 */
public class Matrix {
    private int[][] matrix;
    private int i, j;

    public Matrix(int i, int j) {
        this.i = i;
        this.j = j;

        if (isCreated()) {
            matrix = new int[i][j];
            fill();
        } else
            System.exit(0);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void turnTo(int degree) {

        final int[][] helpMat = new int[i][j];

        if (degree == 90) {
            for (int i = 0; i < this.i; i++) {
                for (int j = 0; j < this.j; j++) {
                    //if (!(i % 2 > 0)) {
                    helpMat[i][j] = matrix[j][this.i - 1 - i];
                   /* } else
                        matrix[i][j] = helpMat[j][i];*/

                    System.out.print(helpMat[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    private boolean isCreated() {
        boolean answer = false;
        if (i > 0 && j > 0)
            answer = true;
        return answer;
    }

    public void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fill() {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10) + 1;
            }
        }
    }
}
