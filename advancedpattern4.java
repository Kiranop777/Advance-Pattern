public class advancedpattern4 {
    public static void pat(int n){
        int ch =1;
        for(int i = 1; i <= n; i++){
               
            for(int j = 1; j <=(n-i+1); j++){
                System.out.print(ch);
                ch++;
           
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        pat(n);
    }
    
}
