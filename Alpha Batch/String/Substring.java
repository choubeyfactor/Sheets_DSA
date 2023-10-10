import java.util.*;
public class Substring {
    
    public static String substring(String str , int si , int ei ){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Helloworld";
        System.out.println(substring(str, 0, 5));
//although we have made the substring function but it is already present in the java module
str.substring(0, 5);
    }
}
