package linkedList.circularLinkedList;


import linkedList.singlyLinkedList.Node;

/*
problem url: https://www.geeksforgeeks.org/problems/circular-linked-list-traversal/1
 */
public class CircularLinkedListTraversal {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        if (head == null) return;
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}
