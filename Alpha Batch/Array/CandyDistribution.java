import java.util.*;
public class CandyDistribution {
//finding subarray of size m such that the 1st and last element of that subarray is minimum
    static int findMinDiff(int arr[] , int n ,int m){
        if (m==0 || n==0) {//if there are no chocolates and students 
            return 0;
        }
        Arrays.sort(arr);//sorting the array of chocolate's packet
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < m+n-1 ; i++) {
            int diff = arr[i+m-1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
    
    public static void main(String[] args) {
     
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
            40, 28, 42, 30, 44, 48, 43, 50 };

        int m = 7;
        int n = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, n, m));

    }
}
//---------------------------------End of The Code---------------------------------------------------------//
