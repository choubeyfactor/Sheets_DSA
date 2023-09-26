import java.util.*;

public class SumOfAll {

    
    public static int SumAll(int n){
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = ans+i;
        }
        return ans;
    }
public static void main(String[] args) {
    System.out.println("Enter your number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.println(SumAll(n));
}    
}
