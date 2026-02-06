package linkedList;


/*
problem url: https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
 */

/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
public class DeleteInASinglyLinkedList {
    Node deleteNode(Node head, int x) {
        if (x == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        for (int i = 1; i < x - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}