// Write a Program takes two matrices of order r1*c1 and r2*c2 respectively. Then, the program multiplies these two matrices (if possible) and displays it on the screen.

/*
Program: Matrix Multiplication using Multidimensional Arrays

Concept:

Matrix A → r1 × c1
Matrix B → r2 × c2

Matrix multiplication is possible only if:
c1 == r2

The resulting matrix C will have size:
r1 × c2

Formula used:
C[i][j] = Σ (A[i][k] * B[k][j])

Meaning of indices:
i → row of matrix A and result matrix C
j → column of matrix B and result matrix C
k → used to multiply elements across row of A and column of B

Three loops are required:
1) i loop → rows of result matrix
2) j loop → columns of result matrix
3) k loop → multiplication and addition steps
*/

import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking dimensions of first matrix
        System.out.println("Enter rows and columns of first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        // Taking dimensions of second matrix
        System.out.println("Enter rows and columns of second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Checking if multiplication is possible
        if(c1 != r2)
        {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < r2; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for(int i = 0; i < r1; i++)        // rows of A
        {
            for(int j = 0; j < c2; j++)    // columns of B
            {
                for(int k = 0; k < c1; k++) // multiplication steps
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display result matrix
        System.out.println("Resultant matrix:");
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
