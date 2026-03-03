// Write a Program to Display Fibonacci Series upto certain number n (n is entered by user) 
// Example: n=100 
// Output: Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,

// for loop → when number of iterations is known
// while loop → when condition decides when to stop

import java.util.*;
class FibonacciSeries 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series upto certain number");
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        int c ;
        while(a <= N)
        {
            System.out.println(a); 
            c = a + b;
            a = b;
            b = c;
           
        }
    }
}

