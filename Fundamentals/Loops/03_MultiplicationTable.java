//  Write a Program to Generate Multiplication Table of a number (entered by the user) using a for loop.

import java.util.*;
class MultiplicationTable 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int mul = 1;
        for(int i = 1; i<=N; i++)
        {
            mul = N * i;
         System.out.println(N + " * " +  i + " = "+ mul);   
        }
    }
}
