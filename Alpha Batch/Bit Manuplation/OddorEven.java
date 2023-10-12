public class OddorEven {
//when we will perform & operation than if it gives 1 as LSB it is odd otherwise it is even i.e. 0

public static void checker(int n){
    int bitMask = 0;

    if ((n & bitMask) == 0) {
            //even number
    System.out.println("even number");
    }else{
    System.out.println("Odd number");
    }


}
public static void main(String[] args) {
    checker(3);
    checker(14);
}
}
