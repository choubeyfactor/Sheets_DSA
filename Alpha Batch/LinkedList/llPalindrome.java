import addInLL.Node;

public class llPalindrome {
    //slow-fast concept
    //half reverse of a linked list

    /*
     * find midNode
     * 2nd half reverse
     * check if (1st half == 2nd half)
     */

     public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow; //slow is midNode
     }

     public boolean checkPalindrome(){

        if (head == null || head.next != null) {
            return true;
        }
        //Step-1 Find Mid


        //Step-2 Reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            prev = curr;
            curr = next;
        }
        Node right = prev //right half head
        removeLL.Node left = head;

        //Step-3 Check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
                left = left.next;
                right = right.next;
        }
        return true;
     }
}
