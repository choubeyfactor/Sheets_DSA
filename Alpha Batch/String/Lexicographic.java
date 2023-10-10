public class Lexicographic {
//compareTo function is used where
//str1.compareTo(str2):o    -> both strings are equal
//                    :-ve  -> str1<str2
//                    :+ve  -> str2>str1
// here A != a


public static void main(String[] args) {
    String fruits[] = {"apple" , "mango" , "banana"};

    String largest = fruits[0];
    for (int i = 1; i < fruits.length; i++) {
        if (largest.compareTo(fruits[i]) < 0) {
            largest = fruits[i];
        }
    }

    System.out.println(largest);
}
} //TC->O(x*N)