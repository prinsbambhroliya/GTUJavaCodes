
// 17 Write a program to define abstract class, 
// with two methods addition() 
// and substraction(), addition() 
// is abstract method. Implement the 
// abstract method and call that method using a program.

import java.util.Scanner;

abstract class CalcAbs {
    public abstract void addition();

    public void substraction() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = s.nextInt();
        System.out.println("Substraction is: " + (a - b));
    }
}

class Calc extends CalcAbs {
    @Override
    public void addition(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = s.nextInt();
        System.out.println("addition is: " + (a + b));
    }
}

public class C17_AbstraceClassExample {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.substraction();
        c.addition();
    }
}


// Output:
// Enter 1st number: 
// 3
// Enter 2nd number:
// 1
// Substraction is: 2
// Enter 1st number:
// 3
// Enter 2nd number:
// 4
// addition is: 7