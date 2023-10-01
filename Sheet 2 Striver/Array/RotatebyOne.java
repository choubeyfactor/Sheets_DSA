
public class RotatebyOne{
    // Brute Force
    public static void rotate(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 1; i < temp.length; i++) {
            temp[i - 1] = arr[i]; // giving one position less in dummy array as compared to original one
        }
        temp[n - 1] = arr[0]; // first position of original array is given to the dummy array

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] + " ");
        }

    }

    // Optimized Approach
    static void solve(int arr[], int n) {
        int temp = arr[0]; // storing the first element of array in a variable
        for (int i = 0; i < n - 1; i++) {
          arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        int n = 5; // array length
        rotate(numbers, n);// calling the function
        System.out.println(numbers);
    }
}
