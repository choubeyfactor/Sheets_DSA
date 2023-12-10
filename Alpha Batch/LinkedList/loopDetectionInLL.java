import java.util.*;
public class loopDetectionInLL { //Floyd's cycle finding algorithm
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }      
    }
    public static Node head;
    public static Node tail;
    
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null){
    slow = slow.next; //+1
    fast = fast.next.next; //+2
    if (slow == fast) {
        return true; //cycle exists
    }
}}

return false; //no cycle

public static void main(String[] args) {
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    //1->2->3->1
    System.out.println(isCycle());
}
}

