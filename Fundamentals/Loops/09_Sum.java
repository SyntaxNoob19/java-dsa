//Write a Program to display sum of all digits of a given Number N by user

import java.util.Scanner;
class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int r;
        int s =0;
        System.out.println("Sum of number ");
        while(n!=0)
        {
            r = n%10;
            s = s + r;
            n = n/10;
        }
        System.out.print(s);
        
    }
}
