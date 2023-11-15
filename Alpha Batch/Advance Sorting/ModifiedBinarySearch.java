/**
 * ModifiedBinarySearch
 */
public class ModifiedBinarySearch {

    public static int modifiedBSearch(int[] arr, int x) {
        // Initialize left and right pointers
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            // Find the middle element of the array
            int m = l + ((r - l) / 2);
            if (arr[m] == x) {
                return m;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
