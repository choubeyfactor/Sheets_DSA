import java.util.*;

public class BinaryString {
    public static void printBinString(int n, int lastPlace, StringBuilder str) {

        if (lastPlace == 0) {
            // sit 0 on chair n
            printBinString(n - 1, 0, str.append("0"));
            printBinString(n - 1, 1, str.append(1));
        } else {
            printBinString(n - 1, 0, str.append("0"));
        }

        /*
         * or you can write as simplified:-
         * if(n==0){    //base case
         * System.out.println(str);
         * return;
         * }
         * 
         * 
         * 
         * printBinString(n-1 , 0 , str.append("0"));
         * if(lastPlace == 0){
         * printBinStrings(n-1 ,1,str.append("1"));}
         */
    }

    public static void main(String[] args) {
    printBinString(3, 0, new StringBuilder(""));
    }
}
