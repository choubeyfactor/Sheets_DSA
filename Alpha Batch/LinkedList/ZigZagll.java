import java.util.*;

import loopDetectionInLL.Node;
public class ZigZagll {
    
    public void zigZag(){
        //find mid
        Node slow = head;
        Npde fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = prev;
        prev = curr;
        curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextL , nextR;

    //alt merge- zig-zag merge

    while(left != null && right != null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = left;

        left = nextL;
        right = nextR;
    }

}
