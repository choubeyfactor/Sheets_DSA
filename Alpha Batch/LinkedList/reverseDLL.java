import java.util.*;

import PrintLL.Node;

public class reverseDLL {
    public void reverse(){
        DoubleLL.Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

        prev = curr;
        curr = next;
        }
    }
    head = prev;
}
