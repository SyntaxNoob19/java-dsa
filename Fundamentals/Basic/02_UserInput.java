//Write a Program to Print Integer Number Entered by User



import java.util.Scanner;
class UserInput {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);
        
    }
}