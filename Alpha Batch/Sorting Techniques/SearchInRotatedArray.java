/**
 * SearchInRotatedArray
 */
public class SearchInRotatedArray {

    public static int search(int arr[], int tar, int si, int ei) {

        if (si>ei) { //base case
            return -1;
        }

        int mid = (si + ei) / 2;

        // case found
        if (arr[mid] == tar) {
            return mid;
        }

        /// mid on L1
        if (arr[si] <= tar && tar <= arr[mid]) {
            // tar is in left half of array
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid);
            } else {
                // tar is in right half of array
                return search(arr, tar, mid + 1, ei);
            }
        }
        
        /// mid on L2
        else {
            // case c : right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // case d : left
                return search(arr, tar, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println("Found at index: " + search(arr, target, 0, arr.length - 1));
    }
}

//--------------------------End Of Code------------------------------------------//
