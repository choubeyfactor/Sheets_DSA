import java.util.*;

public class RemoveDuplicate {

    public static void removeDup(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDup(str, idx, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDup(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "mayank";
        removeDup(str, 0, null, null);
    }
}
