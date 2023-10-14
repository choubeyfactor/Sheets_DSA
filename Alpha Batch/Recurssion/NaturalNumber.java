public class NaturalNumber {
    
    public static int natNum(int n){
        if (n==1) {
            return 1;
        }
        int nn = natNum(n-1) + n;
        return nn; 
    }
    public static void main(String[] args) {
        int  n = 10;
        System.out.println(natNum(n));
    }
}//TC = O(n) = SC
