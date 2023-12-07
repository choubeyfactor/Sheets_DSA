import java.util.*;

public class SearchRecursive {
    public int helper(Node head , int key){ //main recusive function
        if (head == null){ 
        return -1;}
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head , key);
    }
}
