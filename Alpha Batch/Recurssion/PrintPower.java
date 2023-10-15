public class PrintPower {
    public static int printPow(int x , int n){

        if (n==0) {//base case
            return 1;
        }
        int ans = x*printPow(x, n-1);
        return ans;
    } 
    public static void main(String[] args) {
        System.out.println(printPow(2, 10));
    }
}
