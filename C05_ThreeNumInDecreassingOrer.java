import java.util.Scanner;

public class C05_ThreeNumInDecreassingOrer {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        for (int j = 1; j <= 3; j++) {
            System.out.println("Enter " + j + " number:");
            int a = S.nextInt();
            for (int i = a; i > 0; i--) {
                System.out.println(">> " + i);
            }
        }
    }
}


// output:
// Enter 1 number:
// 5
// >> 5
// >> 4
// >> 3
// >> 2
// >> 1
// Enter 2 number:
// 3
// >> 3
// >> 2
// >> 1
// Enter 3 number:
// 7
// >> 7
// >> 6
// >> 5
// >> 4
// >> 3
// >> 2
// >> 1