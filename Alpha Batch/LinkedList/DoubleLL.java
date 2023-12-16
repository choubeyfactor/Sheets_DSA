import java.util.*;

public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = tail;
            head.prev = null;
            tail.prev = head;
            size++;
        } else {
            Node temp = tail;
            tail = newNode;
            temp.next = tail;
            tail.prev = temp;
            size++;
        }
    }

    // remove
    public boolean deleteNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return deleteNode(current);
            }
            current = current.next;
        }
        System.out.println("The given key is not present in the list");
        return false;
    }

    private boolean deleteNode(Node del) {
        if (head == tail) {
            head = tail = null;
        } else if (del == head) {
            head = head.next;
            head.prev = null;  
        } else if (del == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            del.prev.next = del.next;
            del.next.prev = del.prev;
        }
        size--;
        return true;
    }

    // print
    public void printList() {
        Node curr = head;
        System.out.println("Forward Print of Doubly Linked List: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        DoubleLL dll = new DoubleLL();

        dll.addNode(10);
        dll.addNode(20);
        dll.addNode(30);
        dll.addNode(40);
        dll.addNode(50);

        dll.printList();
        System.out.println(dll.size);
    }

}