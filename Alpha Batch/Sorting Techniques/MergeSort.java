/**
 * MergeSort
 */
public class MergeSort {

    public static void printArrz(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int arr[] , int si , int mid , int ei){
        //left(0,3)=4  right(4,6)=3 -> 6-0+1
        int temp[] = new int[ei-si+1];
        int i = si;//iterator for left part
        int j = mid+1;//iterator for right part
        int k = 0;//iterator for temp arr

        while (i<= mid && j<=ei) {
            if (arr[i] < arr[j]) {
                temp[k]=arr[i];
                j++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
                k++;
        }
        while (i<= mid) {
            temp[k++] = arr[i++];
        }
        while (j<= ei) {
            temp[k++] = arr[j++];
        }

        //copying temp to original array
        for ( k=0 , i=si ; k<temp.length ; k++ , i++){
            arr[i]=temp[k];
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // kaam

        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }

    

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergeSort(arr, 0, arr.length-1);//calling the function
        //printing the sorted iriginal array
        printArrz(arr);
    }
}