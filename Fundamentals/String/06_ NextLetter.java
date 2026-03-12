
// Write a C++ program to change every letter in a given string with the letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a).
// Example:
// Sample Input: Abcdef3
// Sample Output: Bcdefg3

import java.util.Scanner;

class NextLetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();
        
        String result = " ";

        System.out.println("String with next letter");
        
        for(int i =0; i< s.length() ; i++)
        {
            if(s.charAt(i) == 'z')
            {
                result += 'a';
            }
            
            else if(s.charAt(i) == 'Z')
            {
                result += 'A';
            }
            
             else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'y') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Y'))
            {
                result += (char)(s.charAt(i)+1);
            }
            else 
            {
                result += s.charAt(i);
            }
        }
        
        System.out.println(result);
    }
}
 
}
