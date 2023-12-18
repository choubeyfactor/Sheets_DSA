import java.util.*;

public class ValidAnagram {
    public boolean isAnagram(String s , String t){
//converting the character string into array of characters
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
//sorting the elements of character array in alphabetical order
        Arrays.sort(sChar);
        Arrays.sort(tChar);
//comparing the sorted character array and deriving results
        return Arrays.equals(sChar , tChar);
    } 
}

//---------------------------End Of Code----------------------------------------------------------------//
