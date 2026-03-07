// Write a Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide Using Switch case The program should takes an arithmetic operator (+, -, * , /) and two operands from a user and performs the operation on those two operands depending upon the operator entered by the user.

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("What to calculate ?? \n1. add , 2. subtract, 3. multiply 4. divide ");
        int operation = sc.nextInt();
        if(operation < 1 || operation > 4)
        {
            System.out.println("Invalid operation");
            return;
        }
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        switch (operation)
        {
            case 1 : System.out.println("Addition is " + (a+b)); break;
            case 2 : System.out.println("subtraction is " + (a-b)); break;
            case 3 : System.out.println("multiplication is " + (a*b)); break;
            case 4 : if(b != 0)
                        System.out.println("Division is " + (a/b));
                     else
                        System.out.println("Cannot divide by zero");
                     break;
        }
    }
}
