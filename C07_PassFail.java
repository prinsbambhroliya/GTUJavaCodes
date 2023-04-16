
// 7 WAP to read marks of five subjects. Calculate percentage and print 
// class accordingly. Fail below 35, Pass Class between 35 to 45, 
// Second Class between 45 to 60, First Class between 60 to 70, 
// Distinction if more than 70.

import java.util.Scanner;

public class C07_PassFail {
    public static void main(String[] args) {
        System.out.println("Enter Marks: ");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        if (m > 70) {
            System.out.println("Distinction");
        } else if (60 <= m && m < 70) {
            System.out.println("First Class");
        } else if (45 <= m && m < 60) {
            System.out.println("Second Class");
        } else if (35 <= m && m < 45) {
            System.out.println("Pass Class");
        } else if (m < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid input");
        }
    }
}

// 1. Output:
// Enter Marks:
// 98
// Distinction

// 1. Output:
// Enter Marks: 
// 44
// Pass Class