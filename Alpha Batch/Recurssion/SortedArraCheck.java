/**
 * SortedArraCheck
 */
public class SortedArraCheck {

    public static boolean checkSort(int arr[] , int i ){
       
        if (i==arr.length-1) {
            return true;
        } //base case

        if (arr[i] > arr[i+1]) {
            return false;
        }
        return checkSort(arr , i+1);
        //calling the recurssive function 
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(checkSort(arr, 0));
    }
}