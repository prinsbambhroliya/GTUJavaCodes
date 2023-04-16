// 15 Write the bin2Dec (string binary String) method to convert a binary 
// string into a decimal number. Implement the bin2Dec method to 
// throw a NumberFormatException if the string is not a binary string.
// /*
// * Program - 15
// * Write the bin2Dec (string binary String) method
// * to convert a binary string into a decimal number.
// * Implement the bin2Dec method to throw a 
// NumberFormatException
// * if the string is not a binary string.
// */



import java.util.Scanner;

public class C15_binToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Binary String:");
        String bs = s.nextLine();

        int num = 0;
        for (int i = bs.length()-1; i >=0; i--) {
            if (bs.charAt(i) == '0') {
            } else {
                num = num + (int) Math.pow(2, (bs.length()-i-1));
            }
            // System.out.println(bs.charAt(i)+" "+i + " " + bs.length()); // For understanding that how the length and charAt give the values
            // length give as total number of char in String.
            // charAt, we pass the index number (start from 0, 1, 2, 3,...)
        }
        System.out.println("Decimal number is: " + num);

    }
}


// 1. Output:
// Enter Binary String:
// 11011
// Decimal number is: 27

// 2. Output:
// Enter Binary String:
// 00101
// Decimal number is: 5