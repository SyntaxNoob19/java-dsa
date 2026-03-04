// Write a Program to Reverse a given Number N by user


import java.util.*;

class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        int n = sc.nextInt();
        int reverse = 0;

        while(n != 0)
        {
            int digit = n % 10;        // extract last digit
            reverse = reverse * 10 + digit;  // build reversed number
            n = n / 10;                // remove last digit
        }

        System.out.println("Reverse number is: " + reverse);
    }
}
