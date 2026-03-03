//Write a Program to Display Fibonacci Series upto nth term (n is entered by user)

// Fibonacci series: A sequence where each number is the sum of the previous two numbers.
// Formula: F(n) = F(n-1) + F(n-2)
// The first two numbers are usually 0 and 1.
// Example series: 0, 1, 1, 2, 3, 5, 8, 13...


import java.util.*;
class FibonacciSeries 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if(N >= 1) System.out.println(a);
        if(N >= 2) System.out.println(b);
        for(int i = 1; i<=N-2; i++)
        {
            c = a + b;
            System.out.println(c); 
            a = b;
            b = c;
        }
    }
}
