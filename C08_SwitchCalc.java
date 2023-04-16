// 8 WAP to make a Simple Calculator using switch...case.

import java.util.Scanner;

public class C08_SwitchCalc {
    public static void main(String[] args) {
        float r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Firct number: ");
        float a = s.nextFloat();
        System.out.print("Enter Your Firct number: ");
        float b = s.nextFloat();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter Your choice: ");
        int c = s.nextInt();

        switch (c) {
            case 1:
                r = a + b;
                System.out.println("addition is: " + r);
                break;
            case 2:
                r = a - b;
                System.out.println("addition is: " + r);
                break;
            case 3:
                r = a * b;
                System.out.println("addition is: " + r);
                break;
            case 4:
                r = a / b;
                System.out.println("addition is: " + r);
                break;
            default:
                System.out.println("Invalid choice...");
                break;
        }

    }
}

// Output:
// Enter Your Firct number: 52.45
// Enter Your Firct number: 45.641
// 1. Addition
// 2. Subtraction
// 3. Multiplication
// 4. Division
// Enter Your choice: 1
// addition is: 98.091