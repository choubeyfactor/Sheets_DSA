import java.util.*;

public class removeLoopInLL {
    //detect cycle using fast slow node
    //after detection slow will again be initiated on head position 
    //now slow nad fast-> +1
    //now when slow = fast ; their meeting point will be initiation point of cycle
    //another variable node prev will be initaiated which after the fast starts comin in loop prev.next = fast

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow= slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
        }
        if (cycle == false) {
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null; //last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next= null;
    }
    }}
