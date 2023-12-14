import java.util.*;

import loopDetectionInLL.Node;
public class MergeSort {
    if(head == null && head.next != null ){
        return head;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = fast.next;

        while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

    }
    return slow; //mid node
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 == null || head2 == null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else { 
                temp.next = head2;
                head2 = head2.next;
                temp  = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }


    public Node mergeSort(Node head){
        //find mid
        Node mid = getMid();
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.head = ll.mergeSort(ll.head);

    }
    
}
