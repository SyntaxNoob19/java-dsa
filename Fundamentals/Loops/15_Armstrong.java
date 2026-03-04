// Write a Program to check whether a number entered by the user is an Armstrong number or not.
// An Armstrong number (or narcissistic number) is a positive integer equal to the sum of its own digits, each raised to the power of the total number of digits. For example, 153 is an Armstrong number because it has 3 digits, and \(1^{3}+5^{3}+3^{3}=1+125+27=153\)
import java.util.*;

class Armstrong 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = n;
        int s = 0;
        int m = 0;
      
      // Count the digits of n
        while(n != 0)
        {
            n = n / 10;
            m++;
        }

      // restore the original value of n 
        n = a;
        int r;
        double p;
      
        // Calculate sum of digits^m
        while(n!=0)
        {
            r = n%10;
            p = Math.pow(r,m);
            s = s + (int)p;
            n = n/10;
        }
        if(s==a)
        System.out.println("Armstrong number ");

        else
        System.out.println("Not Armstrong number ");
        

    }
}
