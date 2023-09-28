//Remove Duplicates in-place from Sorted Array

import java.util.*;
public class DuplicateRemoval {
    // Two pointer approach

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is: ");
        //printing it
        for (int i=0;i<k;i++){
            System.out.println(arr[i] + " ");
        }
    }

    static int removeDuplicates(int arr[]){
        int i = 0;
        for (int j=1 ; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
/*                                      APPROACH:-
 * Take a variable i as 0;
 * Use a for loop by using a variable ‘j’ from 1 to length of the array.
 * If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
 * After completion of the loop return i+1, i.e size of the array of unique elements.
 */