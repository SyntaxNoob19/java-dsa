// Write a Program to Display Prime Numbers Between Two Intervals (entered by use) 
//Example: 
//Enter two numbers: 0 20 
//Prime numbers between 0 and 20 are: 
// 2 3 5 7 11 13 17 19

// Check every number between n and m.
// For each number, test divisibility from 2 to i/2.
// If no divisor is found, the number is prime.

import java.util.*;

class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n = sc.nextInt();

        System.out.println("Enter second number:");
        int m = sc.nextInt();

        System.out.println("Prime numbers between " + n + " and " + m + " are:");

        for(int i = n; i <= m; i++)
        {
            boolean prime = true;

            if(i <= 1)
                prime = false;

            for(int j = 2; j <= i/2; j++)
            {
                if(i % j == 0)
                {
                    prime = false;
                    break;
                }
            }

            if(prime)
                System.out.print(i + " ");
        }
    }
}
