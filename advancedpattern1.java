public class advancedpattern1 {
    public static void main(String[] args) {
        int n = 7; // Number of rows
        int m = 7; // Number of columns
        printPattern(n, m);
    }

    public static void printPattern(int n, int m) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column
            for (int j = 1; j <= m; j++) {
                // Check the conditions to print '*'
                if (i == 1 || i == n || j == 1 || j == m || i == j || j == (m - i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
