public class RotateByXPlaces {
    public static void rotate(int[] arr, int n, int k) {
        if (n == 0) {
            return;
        }
        //finalising the real place of rotaion
        k = k % n;
        if (k > n) {
            return;
        }
        //creating a dummy array
        int[] temp = new int[k];
//storing the value in dummy array till the position of roatation
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        
//storing the backward positions in forward ones in original array only
        for (int i = 0; i < n-k ; i++) {
            arr[i]=arr[i+k];
        }
//now again transfering the original elements at backward position back from the dummy one
        for (int i = n-k; i < n ; i++) {
            arr[i]=temp[i-n+k];
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        rotate(arr, n, k);
        System.out.println("After rotating the elements to left :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
