// Write a Program that adds two matrices using Multi- dimensional Arrays where the number of rows r and columns c is entered by user (Value of r and c < 100)

//  In addition of two matrices, they must have the exact same number of rows and columns

import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();

        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("Enter first matrix:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
