public class Factorial {
    
    public static int Fact(int n ){
        int ans = 1;
        for (int i=1 ; i < n+1 ; i++) {
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println(Fact(3));
    }
}