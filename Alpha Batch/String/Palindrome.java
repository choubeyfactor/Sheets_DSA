public class Palindrome {
    
    public static boolean  isPalindrom(String str){
        for (int i = 0; i < str.length()/2 ; i++) { //running this half way of the string's length to optimize it more
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrom(str));

    }
}
//TC->O(n)
