
/*3 Write a program that reads a number in meters, converts it to feet, 
and displays the result.*/

import java.util.Scanner;

public class C03_ScaleConverter {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double d;
        System.out.println("Enter Length (in meter): ");
        d = s1.nextDouble();

        System.out.println("In feet: " + d * 3.2808398);
    }
}

// Output:
// Enter Length (in meter): 
// 32
// In feet: 104.9868736
