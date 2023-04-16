// // doubt
// /*
//  * Write a program that solves the following equation and displays the 
//  * value x and y:
//  * 1) 3.4x+50.2y=44.5 
//  * 2) 2.1x+.55y=5.9 
//  * (Assume Cramer’s rule to solve equation ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )
// */
public class C02_SolvingExpretattion {
    public static void main(String[] args) {

        // 1) 3.4x+50.2y=44.5
        double x1 = 3.4, y1 = 50.2, c1 = 44.5;

        // 2) 2.1x+.55y=5.9
        double x2 = 2.1, y2 = 0.55, c2 = 5.9;

        double d = x1 * y2 - x2 * y1;
        double dx = c1 * y2 -  y1 * c2;
        double dy = x1 * c2 - x2 * c1;

       
        double x = dx / d;
        double y = dy / d;
        System.out.println("X: " + x + " Y: " + y);
    }
}
// // Output:
// // X: 22.159090909090907 Y: -49.08041958041957
