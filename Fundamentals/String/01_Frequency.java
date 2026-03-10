// Write a Program to Find the Frequency of given Character by user in a String

import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");
        String s = sc.next();

        System.out.println("Character to find frequency");
        char c = sc.next().charAt(0);

        int count = 0;
        
        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
       
        System.out.println("The Frequency of given Character is " + count);

    }
}

// Arrays use a length property
// Strings use a length() method
