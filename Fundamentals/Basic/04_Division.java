// Write a program where the user is asked to enter two integers (divisor and dividend) and the quotient and the remainder of their division is computed.(Both divisor and dividend should be integers.)

import java.util.Scanner;
class Division 
{
    public static void main ( String []args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter divisor : ");
        int divisor = sc.nextInt();
        System.out.print("Enter dividend  : ");
        int dividend = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);
    }
}
