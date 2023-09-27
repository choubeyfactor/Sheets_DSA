import java.util.*;
public class ArrayIntro {

    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97 , 98 ,99};

         update(marks);
                 //print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();


        //taking user input
        System.out.println("Enter the number you want to find in the array: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        update(marks);



        //linearSearch function call

        int index = linearSearch(marks, key);
        if (index == -1) {
            System.out.println("Your number not found");
        }
        else{
            System.out.println("Ypur key is found at " + index + "th index of the particular array");
        }

        int number[] = {1 , 2 , 6 , 3 ,5};

        getSmallest(number);
        gettLargest(number);
       
    }

    //linear search

    public static int linearSearch(int marks[] , int key){

        for (int i = 0; i < marks.length; i++) {
            if (key == marks[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int gettLargest(int number[]){
        int largest = Integer.MIN_VALUE; // indicates - infinity

        for (int i = 0; i < number.length; i++) {
            if (largest<number[i]) {
                largest = number[i];
            }
        }
        System.out.println("Largest value is " + largest);
        return largest;
    }

    public static int getSmallest(int number[]){
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return smallest;
    }
}