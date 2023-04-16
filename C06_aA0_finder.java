/*
 * 6 Write a program that prompts the user to enter a letter and check 
whether a letter is a vowel or constant.
*/

import java.util.Scanner;

public class C06_aA0_finder {
    public static void main(String[] args) {
        System.out.println("Enter Charactor: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u' || str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' || str.charAt(0) == 'O' || str.charAt(0) == 'U'){
            System.out.println("vowel");
        }
        else{
            System.out.println("constant");
        }
    }
}
