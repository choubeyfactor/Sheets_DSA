import java.util.*;

public class PairsInArray {

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i]; // 2,4,6,8,10
            // for the second element in the pair.......
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + " , " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total Pairs = " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);
    }
}

//tp -> Total Pair
//if there are n elements in array then number of pairs formed are n(n+1)/2 