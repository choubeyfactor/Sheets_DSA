public class Fibonnaci {
    
    public static int fib(int n){

        if (n == 0 || n==1) {
            return n;
        }
//base case
        int fn = fib(n-1) + fib(n-2);
        return fn;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));;
    }
}