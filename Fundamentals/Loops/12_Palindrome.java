// Write a Program to Check Whether a Number N entered by user is Palindrome or Not

// A palindrome number in Java is a numeric value that remains the same when its digits are reversed. 
// In other words, a number is a palindrome if reading it from left to right is the same as reading it from right to left. 
// Example: 121, 1331, and 12321 are palindrome numbers.

import java.util.*;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int m = n;
        int reverse = 0;

        while(n != 0)
        {
            int digit = n % 10;       
            reverse = reverse * 10 + digit;  
            n = n / 10;
        }
        if(m==reverse)
        System.out.println("The number is palindrome");
        
        else
        System.out.println("The number is not palindrome");
        
    }
}
