//Odd or even

import java.util.Scanner;

public class OddEven {
    public static void OddOrEvenNumber(int a){
        if (a%2==0){
        System.out.println("Even number");}
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        OddOrEvenNumber(a);
    }
}

//----------------------------------------End Of The Code-----------------------------------------------
