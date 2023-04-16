public class C11_MatrixPrint {
    public static void main(String[] args) {
        int[][] m = {
                { 24, 54, 23 },
                { 54, 53, 32 },
                { 86, 32, 23 }
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}

// Output:
// 24 54 23 
// 54 53 32
// 86 32 23