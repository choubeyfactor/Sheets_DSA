import java.util.*;

public class largestElement {


    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int FindLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int FindSecondLargest(int arr[]){
        int large = Integer.MIN_VALUE; // malink it - infinity
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < arr.length; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }
    //if the number is largest than current element while traversing and also not equal to the largest number
            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
    public static void main(String[] args) {
        int arr[] =  {2,5,1,3,0};
        

        int l = FindLargest(arr);
        int sl = FindSecondLargest(arr);

        System.out.println("Largest is " + l);
        System.out.println("Second Largest is " + sl);

    }
    
}