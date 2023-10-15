/**
 * PrintPowerOptimized
 */
public class PrintPowerOptimized {

    public static int optimizedPower(int a , int n){
        if (n==0) { //base case
            return 1;
        }
        int ans = optimizedPower(a, n/2)*optimizedPower(a, n/2);

        //n is odd
        if (n%2 != 0) {
            ans = a*ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 2));
    }
}//TC->O(nlog(n))