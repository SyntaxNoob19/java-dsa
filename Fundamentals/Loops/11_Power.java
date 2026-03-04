// Write a Program to Calculate Power of a Number without using inbuilt pow() function by taking two inputs from users as Base and exponent respectively

import java.util.Scanner;

class Power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base:");
        int b = sc.nextInt();

        System.out.println("Enter exponent:");
        int e = sc.nextInt();

        int p = 1;

        for(int i = 1; i <= e; i++)
        {
            p = p * b;
        }

        System.out.println("Power of number: " + p);
    }
}
