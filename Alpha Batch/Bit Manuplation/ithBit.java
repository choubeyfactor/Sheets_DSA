import java.util.*;

public class ithBit {
   
 public static int getIthBit(int n , int i){
//basically in this in agiven number when converted to binary , we want to fetch ith position of that
    int bitMask = 1<<i;

    if ((n & bitMask) == 0) {
        return 0;
    }else{
        return 1;
    }
 }

 public static int setIthBit(int n , int i ){
    int bitMask = 1<<i;
    return n | bitMask;
 }

 public static int clearIthBit(int n , int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
 }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));

    }
}

//-----------------------End Of Code------------------------------------------//
