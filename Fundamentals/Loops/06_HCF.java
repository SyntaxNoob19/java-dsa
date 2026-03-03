// Write a Program to Find GCD or HCF of two numbers entered by user

// Euclidean Algorithm (Most Efficient): Divide the larger number by the smaller, then take the remainder and divide the previous divisor by it. Repeat until the remainder is 0. The last non-zero divisor is the GCD. 
/* while(b != 0)
{
    int temp = b;
    b = a % b;
    a = temp;
}
*/

// The Greatest Common Divisor (GCD) and Highest Common Factor (HCF) are the same, representing the largest positive integer that divides two numbers without a remainder

import java.util.*;

class HCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF is " + hcf);
    }
}
