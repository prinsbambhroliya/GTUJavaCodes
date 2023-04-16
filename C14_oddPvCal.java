import java.util.Scanner;

public class C14_oddPvCal {
    public static void main(String[] args) {
        System.out.println();
        int i = 1;
        int sumOfPositiveEvenNumber = 0;
        int sumOfNegativeOddNumber = 0;
        int temp = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 0 for exit.");
        while (i != 0){
            System.out.print(" Enter Number: ");
            temp = s.nextInt();
            if(temp < 0 && temp % 2 != 0){ sumOfNegativeOddNumber += temp;}
            if(temp > 0 && temp % 2 == 0){ sumOfPositiveEvenNumber += temp;}
            if(temp == 0) {i = 0;}
            System.out.println("Even Positive even sum: " + sumOfPositiveEvenNumber);
            System.out.println("Even Negative odd sum: " + sumOfNegativeOddNumber);
        }
    }
}

// Output:
// Enter 0 for exit.
//  Enter Number: 4
// Even Positive even sum: 4
// Even Negative odd sum: 0
//  Enter Number: 4
// Even Positive even sum: 8
// Even Negative odd sum: 0
//  Enter Number: 3
// Even Positive even sum: 8
// Even Negative odd sum: 0
//  Enter Number: 5
// Even Positive even sum: 8
// Even Negative odd sum: 0
//  Enter Number: 2
// Even Positive even sum: 10
// Even Negative odd sum: 0
//  Enter Number: -4
// Even Positive even sum: 10
// Even Negative odd sum: 0
//  Enter Number: -7
// Even Positive even sum: 10
// Even Negative odd sum: -7
//  Enter Number: -9
// Even Positive even sum: 10
// Even Negative odd sum: -16
//  Enter Number: -4
// Even Positive even sum: 10
// Even Negative odd sum: -16
//  Enter Number: 0
// Even Positive even sum: 10
// Even Negative odd sum: -16
