import java.util.*;

//every case will be considered normally but 
//the addition of small positive and big negative number will be considered as zero
//as it will give negative number only that will reduce the max sum
public class KadanesAlgorithm {

    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs<0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our maximum subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int number[] = {-2 ,-3 , 4, -1 ,-2 ,1 , 5 ,-3 };
        kadanes(number);
    }
}

//TC -> O(n)
