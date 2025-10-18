public class advancedpattern2{
    public static void main(String[] args) {
        int n = 4; // Number of rows
        int m = 4; // Number of columns
        // printPattern(n, m);
        inevertes(n);
    }
     // this is done by me
    public static void printPattern(int n, int m) {
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column
            for (int j = 1; j <= m; j++) {
                // Check the conditions to print '*'
                if ( i == n || j == m || (i + j) == (m + 1)|| (i+j)> (m+1) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void inevertes(int n){
    for(int i = 1; i <= n; i++){

        for(int j = 1; j <=(n-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
        
    }
}