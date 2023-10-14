public class RecurssionBasic {
    
//Printing number in descending order
    public static void printDec(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n-1);
    }
//Printinc number in ascending order
    public static void printInc(int n){
        if (n == 0) {
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
    }
    
}