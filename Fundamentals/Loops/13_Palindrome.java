// Write a Program to Check Whether a Number is Prime or Not
// prime if not divisible by any other number except 1 or itself 
import java.util.*;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean p = true;

        for( int i = 2; i< n/2 ; i++)
        {
            if(n%i != 0)
            {
                p = false;
                break;
            }
        }
        if(p == true)
        System.out.println("The number is prime");
        
        else
        System.out.println("The number is not prime");
        
    }
}
