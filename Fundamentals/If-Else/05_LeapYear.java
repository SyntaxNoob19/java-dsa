// Write a Program to Check whether a year entered by user is Leap Year or not

// Concept of Leap Year:
// A leap year has 366 days instead of 365.
// February has 29 days in a leap year.

// A year is a leap year if:

// 1. The year is divisible by 4 AND not divisible by 100
//        OR
// 2. The year is divisible by 400

// In short:
// if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
// then the year is a leap year.

//1900
//divisible by 4 
//divisible by 100 
//not divisible by 400 → NOT a leap year
//If we didn't check %100, 1900 would incorrectly become a leap year.


import java.util.*;
class LeapYear
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
          {
            System.out.println("Leap Year");
          }
        else
          {
            System.out.println("Not Leap Year");
          }
    }
}
