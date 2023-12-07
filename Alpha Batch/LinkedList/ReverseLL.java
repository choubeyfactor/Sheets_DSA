import java.util.*;

import intro.Node;
public class ReverseLL {

/* Steps:-
 * next == curr.next .........fundamental step of pivot dxn changing
 * curr.next == prev
 * prev == curr..........now , by this after the pivot you will apply the findamental to change to all upcoming node
 * curr == next
 */

 public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
 }
//TC->O(n)
}
