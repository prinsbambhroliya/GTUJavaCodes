// 16 Write a program that illustrates interface inheritance. Interface P is 
// extended by P1 and P2. Interface P12 inherits from both P1 ans P2.
// Each interface declares one constant and one method. Classe Q 
// implements P12.Instantiate Q and invokes each of its methods. Each 
// method displays one of the constants.

interface P1 {
    final int IP1 = 10;

    public void show();
}

interface P2 {
    final int IP2 = 20;

    public void info();
}

interface P12 extends P1, P2 {
    final double PI = 3.14;
}

class Q implements P12 {
    public void show() {
        System.out.println("From P1 Interface in Q class.");
    }

    public void info() {
        System.out.println("From P2 Interface in Q class.");
    }

    public void localView() {
        System.out.println("IP1 is: " + IP1);
        System.out.println("IP2 is: " + IP2);
        System.out.println("PI is: " + PI);
    }
}

public class C16_InterfaceExample {
    public static void main(String[] args) {
        Q obj= new Q();
        obj.show();
        obj.info();
        obj.localView();
    }
}

// Output:
// From P1 Interface in Q class.
// From P2 Interface in Q class.
// IP1 is: 10
// IP2 is: 20
// PI is: 3.14

