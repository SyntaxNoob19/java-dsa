// Write a Program to Find LCM of two numbers entered by user

// LCM (Least Common Multiple) is the smallest number that is divisible by both numbers.
// Logic: Start checking numbers from the larger of the two inputs.
// If a number is divisible by both (i % a == 0 && i % b == 0), that number is the LCM.

// Instead of starting from 1, start from max(a, b) because LCM cannot be smaller than both numbers.
//int i = Math.max(a, b);

import java.util.*;

class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = (a > b) ? a : b;

        while(true) {
            if(max % a == 0 && max % b == 0) {
                System.out.println("LCM is " + max);
                break;
            }
            max++;
        }
    }
}


// optimised approach 
//Relationship: LCM × GCD = a × b

/*int gcd = a;
int temp = b;

while(temp != 0) {
    int r = gcd % temp;
    gcd = temp;
    temp = r;
}

int lcm = (a * b) / gcd;
System.out.println("LCM is " + lcm);
*/
