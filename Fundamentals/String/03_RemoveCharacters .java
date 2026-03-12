// Write a Program to Remove all Characters in a String Except Alphabets.
// Example:
// Enter a string: p2'r"o@gram84iz./
// Output String: programiz

import java.util.Scanner;

class RemoveCharacters  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");
        String s = sc.nextLine();

        System.out.println("all Characters in a String Except Alphabets.");
        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' )
            {
                 System.out.print(s.charAt(i));
            }
        }
       
        

    }
}
