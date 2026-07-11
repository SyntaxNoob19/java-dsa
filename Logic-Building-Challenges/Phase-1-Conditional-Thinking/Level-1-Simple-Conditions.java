/*Older versions of Java use these prefixes for number literals:

10      // Decimal (base 10)
010     // Octal (base 8)
0x10    // Hexadecimal (base 16)
0b10    // Binary (base 2)*/




class Main {
    public static void main(String[] args) {
        largest(10, 140, 55);
    }



//1. Take a number and print whether it's positive, negative, or zero.
public static void number(int n) {
        if(n>0)
        {
            System.out.println("number is positive");
        }
        else if(n<0)
        {
            System.out.println("number is negative");
        }
        else
        {
        System.out.println("number is zero.");
        }
    }
    
    //2. Check if a number is even or odd.
    public static void evenodd(int n) {
        if(n%2==0)
        {
            System.out.println("number is even");
        }
        else 
        {
            System.out.println("number is odd");
        }
    }
    
    //3. Check if a number is divisible by 5.
    public static void divisibleby5(int n) {
        if(n%5==0)
        {
            System.out.println("number is divisible by 5");
        }
        else 
        {
            System.out.println("number is not divisible by 5");
        }
    }
    
    //4. Check if a number is divisible by both 3 and 5.
    public static void divisibleby3and5(int n) {
        if(n%5==0 && n%3==0)
        {
            System.out.println("number is divisible by both 3 and 5");
        }
        else 
        {
            System.out.println("number is not divisible by both 3 and 5");
        }
    }
    
    //5. Check if a given year is a leap year.
    public static void leapyear(int n) {
        if(n%400==0 || (n%100!=0 && n%4==0))
        {
            System.out.println("year is a leap year");
        }
        else 
        {
            System.out.println("year is not a leap year");
        }
    }
    
    //6. Take two numbers and print the larger one
    public static void larger(int n, int m) {
        if(n>m)
        {
            System.out.println(n+" is larger");
        }
        else if (m>n)
        {
            System.out.println(m+" is larger");
        }
        else {
            System.out.println("Both are equal");
        }
    }
    
    //7. Take three numbers and print the largest.
     public static void largest(int n, int m, int o) {
        if(n>=m && n>=o)
        {
            System.out.println(n+" is largest");
        }
        else if(m>=n && m>=o)
        {
            System.out.println(m+" is largest");
        }
        else 
        {
            System.out.println(o+" is largest");
        }
    }
    
    //8. Take a temperature value and print "Cold", "Warm", or "Hot" using range conditions.
     public static void temperature(int n) {
        if(n>=10 && n<=40)
        {
            System.out.println(n+" is warm");
        }
        else if(n<10)
        {
            System.out.println(n+" is cold");
        }
        else 
        {
            System.out.println(n+" is hot");
        }
    }
    
    //9. Take a character and check if it's a vowel or consonant.
    public static void vowelconsonant(char n) {
        n = Character.toLowerCase(n);

        if(n=='a'|| n=='e'|| n=='i'|| n=='o'|| n=='u' )
        {
            System.out.println(n+" is vowel");
        }
        else 
        {
            System.out.println(n+" is consonant");
        }
    }
    
    //10. Take a character and check whether it's uppercase, lowercase, a digit, or a specialcharacter.
    public static void character(char n ) {
        if(n>='A' && n<='Z')
        {
            System.out.println(n+" is uppercase");
        }
        else if(n>='a' && n<='z')
        {
            System.out.println(n+" is lowercase");
        }
        else if(n>='0' && n<='9')
        {
            System.out.println(n+" is digit");
        }
        else 
        {
            System.out.println(n+" is specialcharacter");
        }
    }

  

}

