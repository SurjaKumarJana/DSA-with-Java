package linkedList;


/*
problem url: https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
 */

/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

public class DeleteMiddleOfLinkedList {
    Node deleteMid(Node head) {

        if(head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while(fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;//deleteing the node

        return head;
    }
}
