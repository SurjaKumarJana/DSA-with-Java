package linkedList.circularLinkedList;


import linkedList.singlyLinkedList.Node;

/*
problem url: https://www.geeksforgeeks.org/problems/reverse-the-circular-linked-list/1
 */
public class ReverseTheCircularLinkedList {
    public Node reverseCircular(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr.next != head){
            next = curr.next;
            curr.next = prev;

            //move pointers
            prev = curr;
            curr = next;
        }

        curr.next = prev;
        head.next = curr;

        return curr;

    }
}
