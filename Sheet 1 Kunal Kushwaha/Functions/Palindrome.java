import java.util.*;

public class Palindrome {

    public static boolean CheckPalindrome(String str){
        int len = str.length();

        for (int i = 0; i < len/2; i++) {
            if ((str.charAt(i)) != (str.charAt(len - i - 1))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        CheckPalindrome(x);

        if (CheckPalindrome(x) == true) {
            System.out.println("Yes , It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
