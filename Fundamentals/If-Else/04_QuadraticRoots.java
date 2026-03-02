//Write a Program which accepts coefficients of a quadratic equation from the user and displays the roots (both real and complex roots depending upon the discriminant).

// Concept:
// A quadratic equation is an equation of the form:
// ax^2 + bx + c = 0
// where a, b and c are coefficients and a ≠ 0.

// To find the roots of the quadratic equation we use the formula:
// x = (-b ± √(b^2 - 4ac)) / (2a)

// The term (b^2 - 4ac) is called the discriminant (D).

// The value of the discriminant determines the nature of the roots:

// 1. If D > 0
//    The equation has two real and distinct roots.
//    x1 = (-b + √D) / (2a)
//    x2 = (-b - √D) / (2a)

// 2. If D = 0
//    The equation has two real and equal roots.
//    x = -b / (2a)

// 3. If D < 0
//    The equation has two complex roots.
//    Real part = -b / (2a)
//    Imaginary part = √(-D) / (2a)
//    Roots = real ± imaginary i

import java.util.*;

class QuadraticRoots {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float discriminant = b*b - (4*a*c);

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2*a);

            System.out.println("Two real and different roots");
            System.out.println(x1);
            System.out.println(x2);
        }

        else if (discriminant == 0) {
            double x = (-b) / (2*a);

            System.out.println("Two real and same roots");
            System.out.println(x);
            System.out.println(x);
        }

        else {
            double real = -b / (2*a);
            double imaginary = Math.sqrt(-discriminant) / (2*a);

            System.out.println("Two complex roots");
            System.out.println(real + " + " + imaginary + "i");
            System.out.println(real + " - " + imaginary + "i");
        }

        sc.close();
    }
}
