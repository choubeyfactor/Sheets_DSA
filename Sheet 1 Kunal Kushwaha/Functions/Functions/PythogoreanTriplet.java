import java.util.*;

public class PythogoreanTriplet {

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Calculate the squares of the three numbers
        int squareA = a * a;
        int squareB = b * b;
        int squareC = c * c;

        // Check if the sum of squares of two smaller numbers equals the square of the largest number
        if (squareA + squareB == squareC || squareB + squareC == squareA || squareA + squareC == squareB) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
        } else {
            System.out.println("The triplet (" + a + ", " + b + ", " + c + ") is not a Pythagorean triplet.");
        }
    }    
}
