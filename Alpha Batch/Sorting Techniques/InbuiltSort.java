import java.util.*;

public class InbuiltSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
 public static void main(String[] args) {
    int arr[] = {1,3,2,5,4};
    int si = 1; //the position from where the sorting will begin in the particular index
    int ei = 3;//the position where the sorting will end in the particular index

    Arrays.sort(arr);
    printArr(arr);

    Arrays.sort(arr,si,ei);
    printArr(arr);

    Arrays.sort(arr,Collections.reverseOrder());
    printArr(arr);

 }   
}
