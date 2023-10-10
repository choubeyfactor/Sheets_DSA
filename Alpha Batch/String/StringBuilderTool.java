import java.util.*;

public class StringBuilderTool {
   

    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("");
         for (char ch = 0; ch<='z' ; ch++) {
            sb.append(ch);
         }//abcdefghijklmn
         System.out.println(sb);
         System.out.println(sb.length());
    }
}
