public class SelectionSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) { //if we want series in ascending 
                    minPos = j;
                }
                /*
                if (arr[minPos] < arr[j]) {
                    minPos = j; //if we want series into  descending
                }
                 */
            }
            // swap
            // here we will use swap function outside the loop not inwards like bubblesort
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArr(arr);
    }
}
