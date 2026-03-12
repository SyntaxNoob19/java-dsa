// Write a Program to Find the Length of a String entered by user

import java.util.Scanner;

class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        int len = s.length();

        System.out.println("Length of the string is: " + len);
    }
}

/*
int count = 0;

        for(char c : s.toCharArray())
        {
            count++;
        }
*/

/*
int count = 0;

        for(int i = 0; ; i++)
        {
            try {
                s.charAt(i);
                count++;
            }
            catch(Exception e)
            {
                break;
            }
        }
*/



