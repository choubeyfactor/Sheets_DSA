
public class BubbleSort {

 public static void bSort(int arr[]){
    for (int turn = 0; turn < arr.length-1; turn++) { //outer loop will run times
        for (int j = 0; j < arr.length-1-turn ; j++) {//inner loop will run n-1-turn times
            if (arr[j] > arr[j+1]) {
                //swap
                int temmp= arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temmp;
            }
        }
    }
 }

 public static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
    }
    System.out.println();
 }
 public static void main(String[] args) {
    int arr[] = {5 , 4, 1 , 3 , 2};
    bSort(arr);
    printArr(arr);
 }
}
//TC-> O(n^2)