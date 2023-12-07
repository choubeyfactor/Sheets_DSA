import java.util.*;
public class addInLL {
    
    public class Node{
        int data;
        int next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1: create new node
        Node newNode  = new Node(data);
        size++;
        if (head==null) {
            head = tail = newNode;
            return;
        }
        //step2: newNode = head
        newNode.next = head;//link
        //step3: head = newNode
        head = newNode;
    }
    public void addLast(int data){
        //step1: create new node
        Node newNode  = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
            }
            //step2: link the last node to newnode
            tail.next=newNode;
            //step3: update tail
            tail = newNode;
    }

    public void add(int idx , int data ){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        //i = idx-1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        LinkedList l1  = new LinkedList<>();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);
        l1.add(2,3);

        System.out.println(l1.size()); //TC-> O(1) because size is a static variable
    }
}
 