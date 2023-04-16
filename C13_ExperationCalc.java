// // 13 Write a program for calculator to accept an expression as a string in 
// // which the operands and operator are separated by zero or more 
// // spaces.
// // For ex: 3+4 and 3 + 4 are acceptable expressions.
// // /*
// // * 
// // * Write a program for calculator to accept an expression
// // * as a string in which the operands and operator are
// // * separated by zero or more spaces.
// // * For ex: 3+4 and 3 + 4 are acceptable expressions.
// // */





/**************************************** !!! Partially Correct !!! ******************************************/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class C13_ExperationCalc {
    public static int priority(char a) {
        if (a == '^') {
            return 3;
        } else if (a == '/' || a == '*') {
            return 2;
        } else if (a == '+' || a == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Expration:");
        String strExp = s.nextLine();
        List<Character> finalPostfixList = new ArrayList<>();
        List<Character> tempList = new ArrayList<>();

        List postfixSolver = new ArrayList();

        // Infix to PostFix Converter
        char n;
        for (int i = 0; i < strExp.length(); i++) {
            n = strExp.charAt(i);
            if (Character.isDigit(n)) {
                finalPostfixList.add(n);
            } else if (n == ' ') {
                // Nothing to do...
            } else {
                if (tempList.size() != 0) {
                    if (priority(n) > priority((char) tempList.get(tempList.size() - 1))) {
                        tempList.add(n);
                    } else if (priority(n) == priority((char) tempList.get(tempList.size() - 1))) {
                        finalPostfixList.add(tempList.get(tempList.size() - 1));
                        tempList.remove(tempList.size() - 1);
                        tempList.add(n);
                    } else {
                        while (priority(n) < priority((char) tempList.get(tempList.size() - 1))) {
                            finalPostfixList.add(tempList.get(tempList.size() - 1));
                            tempList.remove(tempList.size() - 1);
                        }
                        tempList.add(n);
                    }
                } else {
                    tempList.add(n);
                }
            }
        }
        for (int k = 0; k <= tempList.size(); k++) {
            finalPostfixList.add(tempList.get(tempList.size() - 1));
            tempList.remove(tempList.size() - 1);
        }

        System.out.print("Postfix Equation: ");
        for (char a : finalPostfixList) {
            System.out.print(a);
        }
        // ------------------------------------

        // Postfix equation solver
        int tempint1 = 0;
        int tempint2 = 0;
        int tempResult = 0;
        char tempChar;
        for (int j = 0; j < finalPostfixList.size(); j++) {
            tempChar = finalPostfixList.get(j);
            if (Character.isDigit(tempChar)) {
                postfixSolver.add(tempChar);
            } else {
                tempint1 = Integer.parseInt(postfixSolver.get(postfixSolver.size() - 1).toString());
                postfixSolver.remove(postfixSolver.size() - 1);
                tempint2 = Integer.parseInt(postfixSolver.get(postfixSolver.size() - 1).toString());
                postfixSolver.remove(postfixSolver.size() - 1);
                switch (tempChar) {
                    case '/':
                        tempResult = tempint2 / tempint1;
                        break;
                    case '*':
                        tempResult = tempint2 * tempint1;
                        break;
                    case '-':
                        tempResult = tempint2 - tempint1;
                        break;
                    case '+':
                        tempResult = tempint2 + tempint1;
                        break;
                    default:
                        tempResult = (int) Math.pow((double) tempint2, (double) tempint1);
                        break;
                }
                postfixSolver.add(tempResult);
            }

        }
        System.out.println(); // New Line
        System.out.println("Answer is: " + postfixSolver.get(0));
    }
}

// 1. Output (with space):
// Enter Expration:
// 4 + 3
// Postfix Equation: 43+
// Answer is: 7

// 2. Output (without space)
// Enter Expration:
// 4+3
// Postfix Equation: 43+
// Answer is: 7

/*
 * Problem:
 * at Division and multiplication.
 * infix to postfix is true.
 */