// 2) Write a Program to Find Factorial of a given number N (N is entered by user)


// Concept: Factorial is the multiplication of all integers from 1 to N.
// Formula: N! = N × (N-1) × (N-2) ... × 1
// Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
// Approach: Use a loop to multiply numbers from 1 to N and store the result.

import java.util.*;
class Factorial
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int mul = 1;
        for(int i = 1; i<=N; i++)
        {
            mul *= i;
        }
        
    System.out.println("Factorial of a given number " + N + " is "+ mul);

    }
}
