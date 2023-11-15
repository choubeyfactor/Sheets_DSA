/**
 * ModifiedBubbleSort
 */
public class ModifiedBubbleSort {

    public static void modBsort(int arr[]){
    for(int turn=0 ; turn<arr.length-1 ; turn++){
        boolean swapped = false;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j+1]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                swapped = true;
            }
        }
        if (swapped == false) {
            break;
        }
    }
}
}
//Worst Case TC -> O(n^2)    ....same as that of simple bubble sort
//Best Case Tc -> O(n)