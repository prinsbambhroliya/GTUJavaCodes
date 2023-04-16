
/*
* 4 Body Mass Index (BMI) is a measure of health on weight. It can be 
calculated by taking your weight in kilograms and dividing by the 
square of your height in meters. 
Write a program that prompts the 
user to enter a weight in pounds and height in inches and displays 
the BMI. Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
*/
import java.util.Scanner;

public class C04_BodyMassIndex {
    public static void main(String[] args) {
        Scanner mass = new Scanner(System.in);
        System.out.println("Enter mass in pound: ");
        double m = mass.nextDouble() * 0.45359237;
        System.out.println("Enter height in inches: ");
        double h = mass.nextDouble() * 0.0254;

        double bmi = m / h;
        System.out.println("Body Mass Index (BMI) is: " + bmi);
    }
}

// Output:
// Enter mass in pound: 
// 115.332
// Enter height in inches: 
// 5.3
// Body Mass Index (BMI) is: 388.602846656069 
