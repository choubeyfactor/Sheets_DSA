import java.util.*;

public class maxHistogramArea {

    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nrs[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i > 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                // -1
                nrs[i] = arr.length;
            } else {
                nrs[i] = s.peek();
            }
            s.push(i);
        }
        // Next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area : width = j-i-1 = nsr[i]-nsl[i]
        for (int i = 0; i < arr.length; i++) {
            int heights = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = heights*width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram = " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 5, 6, 2, 3 }; // heights in histogram
        maxArea(arr);
    }
}