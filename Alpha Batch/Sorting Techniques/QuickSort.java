public class QuickSort {

    public static void printArrz(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickS(int arr, int si, int ei) {

        // last element
        int pidx = partition(null, si, ei);
        quickS(arr, si, pidx - 1);
        quickS(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1; // to make places for elements smaller than pivot
        for (int j=si ; j<ei ; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
         // swap
                int temp = pivot;
                arr[ei] = temp;
                arr[i] = temp;

                return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickS(0, 0, arr.length-1);
        printArrz(arr);
    }
}
