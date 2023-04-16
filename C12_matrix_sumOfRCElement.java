public class C12_matrix_sumOfRCElement {
    public static void main(String[] args) {
        int sum = 0;
        int[][] m = {
                { 14, 62, 41, 26 },
                { 46, 24, 46, 68 },
                { 26, 16, 24, 41 },
                { 67, 63, 42, 16 }
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += m[i][j];
            }
            System.out.println("The sum of Row number " + (i + 1) + " is: " + sum);
            sum = 0;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += m[j][i];
            }
            System.out.println("The sum of Column number " + (i + 1) + " is: " + sum);
            sum = 0;
        }
    }
}

// Output:
// The sum of Row number 1 is: 143
// The sum of Row number 2 is: 184
// The sum of Row number 3 is: 107
// The sum of Row number 4 is: 188
// The sum of Column number 1 is: 153
// The sum of Column number 2 is: 165
// The sum of Column number 3 is: 153
// The sum of Column number 4 is: 151