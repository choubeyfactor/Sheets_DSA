
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class MaxNum {
    public static void MaxOf(int first , int second , int third ){

        int max = first;
        if (max<second) {
            max=second;
        }
        if (max<third) {
            max=third;
        }
        System.out.println("Maximum of three number is:  "+ max);
    }

    public static void MinOf(int first , int second , int third ){

        int min = first;
        if (min>second) {
            min=second;
        }
        if (min>third) {
            min=third;
        }
        System.out.println("Minimum of three number is: " + min);
}  

public static void main(String[] args) {
    MinOf(2, 3, 5);
    MaxOf(2, 3, 5);
}
}