package com.jubair.MatrixMultiplication;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class MatrixMultiplication {

    Scanner input;

    /*public static void main(String[] args) {
        run();
    }
*/
    public String run(){
        int a[][] = new int[5][5];
        int b[][] = new int[5][5];
        int c[][] = new int[5][5];
        int row1, col1, row2, col2;

        System.out.println("Enter the order of first matrix <= 5");

        row1 = input.nextInt();
        col1 = input.nextInt();

        System.out.println("Enter the order of second matrix <= 5");
        row2 = input.nextInt();
        col2 = input.nextInt();

        if(col1 == row2){
            System.out.println("Enter first matrix");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    a[i][j] = input.nextInt();
                }
            }

            System.out.println("Enter second matrix");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    b[i][j] = input.nextInt();
                    //System.out.print(b[i][j] + " ");
                }
                //System.out.println();
            }

            String matrix = "";
            System.out.println("Multiplication of two matrix is");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < row2; k++) {
                        c[i][j] += (a[i][k] * b[k][j]);
                    }
                    //System.out.print(c[i][j] + " ");
                    matrix=matrix.concat(c[i][j] + " ");
                }

                matrix=matrix.trim().concat("\n");
            }
            System.out.println(matrix);
            return matrix;
        }
        else {
            System.out.println("Matrix multiplication is not possible");
            return "Not Possible";
        }
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
