import java.util.*;
public class PrintLL {
    
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

    public void addFirst(int data){
        //step1: create new node
        Node newNode  = new Node(data);
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
        if (head == null) {
            head = tail = newNode;
            return;
            }
            //step2: link the last node to newnode
            tail.next=newNode;
            //step3: update tail
            tail = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            }
            System.out.println("null");
            }
    public static void main(String[] args) {
        LinkedList l1  = new LinkedList<>();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addLast(3);
        l1.addLast(4);
    }
}
 