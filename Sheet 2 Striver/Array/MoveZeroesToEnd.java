import java.util.*;

public class MoveZeroesToEnd {

    public static int[] movezeroes(int n, int arr[]) {
        // temporary array
        ArrayList<Integer> temp = new ArrayList<>();
        // copy non zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        // number of non-zero elements.
        int nz = temp.size();

        // copy elements from temp
        // fill first nz fields of
        // original array:

        for (int i = 0 ; i < nz ; i++) {
            arr[i] = temp.get(i);
        }
        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }

        return arr;
    }//TC:O(2n)




    /*Optimal Approach(Using 2 pointers): 
We can optimize the approach using 2 pointers i.e. i and j.
The pointer j will point to the first 0 in the array and i will point to the next index.

Algorithm:
First, using a loop, we will place the pointer j. If we don’t find any 0, we will not perform the following steps.
After that, we will point i to index j+1 and start moving the pointer using a loop.
While moving the pointer i, we will do the following:
If a[i] != 0 i.e. a[i] is a non-zero element: We will swap a[i] and a[j]. Now, the current j is pointing to the non-zero element a[i]. So, we will shift the pointer j by 1 so that it can again point to the first zero.
Finally, our array will be set in the right manner.
     */



     public static int[] movezeroesOptimal(int n , int a[]){
        int j = -1;
        //place the pointer j 
        for (int i = 0; i < n; i++) {
            if (a[i] == 0 ) {
                j = i;
                break;
            }
        } 
        //no non zero elements
        if (j==-1) {
            return a;
        }
        //move the pointers i and j
        //and swap accordingly
        for (int i = j+1 ; i < n; i++) {
            if (a[i] != 0) {
                                //swap a[i] & a[j]:
                                int tmp = a[i];
                                a[i] = a[j];
                                a[j] = tmp;
                                j++;
            }
            
        }
     }

        public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int a[] = {1,2,0,0,0,3,4,5,6,0,9};
        int n = 10;
//calling and fitting the function
        int ans[] = movezeroes(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
//TC=O(n)
//SC=O(1)
}
