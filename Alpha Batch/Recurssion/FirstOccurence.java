public class FirstOccurence {
    
    public static int firstOcuur(int arr[] , int key , int i){

        if (i==arr.length) {
            return -1;
        }
        if (arr[i] == key) { //base case
            return i;
        }
        return firstOcuur(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,4};
        System.out.println(firstOcuur(arr, 0, 0));
    }
}
