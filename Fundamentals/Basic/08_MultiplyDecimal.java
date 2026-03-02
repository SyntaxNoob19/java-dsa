//Write a Program to Multiply two decimal Numbers
entered by User
class MultiplyDecimal {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first decimal number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second decimal number: ");
        double num2 = sc.nextDouble();
        double result = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
    }
}
