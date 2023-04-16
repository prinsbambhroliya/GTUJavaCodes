
// // 9 Write a method with following method header. public static int 
// // gcd(int num1, int num2) Write a program that prompts the user to 
// // enter two integers and compute the gcd of two integers.

import java.util.Scanner;

public class C09_gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        System.out.println("Enter second number: ");
        int b = s.nextInt();

        System.out.println("GCD is: " + gcd(a, b));

    }

    public static int gcd(int num1, int num2) {
        // return num2;
        int x = 0, y, t2;
        // int t = 0;
        x = (num1 > num2) ? (num1) : (num2);
        y = (num1 < num2) ? (num1) : (num2);

        while (y != 0) {

            // t = y * (x / y) + (x % y);
            // System.out.println(t + " = " + x + " * " + (x % y) + " + " + y);
            t2 = x;
            x = y;
            y = t2 % y;
        }
        return x;
    }
}

// 1. Output:
// Enter first number: 
// 20
// Enter second number:
// 16
// GCD is: 4

// 2. Outut:
// Enter first number: 
// 3768
// Enter second number:
// 1701
// GCD is: 3


//----------------------- Consept method use ----------------------
// gcd(1701, 3768)
// 3768 = 3768 * 366 + 1701
// 1701 = 1701 * 237 + 366
// 366 = 366 * 129 + 237
// 237 = 237 * 108 + 129
// 129 = 129 * 21 + 108
// 108 = 108 * 3 + 21
// 21 = 21 * 0 + 3
// 21 = 3 * 7 + 0
// then second last line, there is reminder is 3, so it is a GCD.