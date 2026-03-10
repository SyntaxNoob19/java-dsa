// Write a Program that takes a matrix of order r*c from the user and computes the transpose of the matrix.

/*
The transpose of a matrix means:
Rows become columns
Columns become rows

Mathematically:
A[i][j] → A[j][i]
*/

import java.util.Scanner;

class MatrixTranspose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows:");
        int r = sc.nextInt();

        System.out.println("Enter columns:");
        int c = sc.nextInt();

        int[][] A = new int[r][c];

        System.out.println("Enter matrix:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose matrix:");

        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++)
            {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }
}
