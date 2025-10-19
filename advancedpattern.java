public class advancedpattern3 {
    public static void pat(int n){
        for(int i = 1; i <= n; i++){
          int ch = 1;
            for(int j = 1; j <=(n-i+1); j++){
                System.out.print(ch);
                ch++;
           
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 5;
        pat(n);
    }
    
}
