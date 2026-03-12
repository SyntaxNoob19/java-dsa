// Write a Program to Concatenate (join) Two Strings entered by user

import java.util.Scanner;

class Concatenate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();
        
        System.out.println("Concatenate (join) Two Strings " + (s1+s2));
    }
}

