import java.util.*;
public class SearchIterative {
    public int itrSearch(int key ){//TC->O(1)
        Node temp = head;
        int i = 0;
        while (temp != null){
            if (key == temp.data) return i;
            else{
                temp = temp.next;
                i++;
                } }
    //key not found return -1
    return -1;

}
}
