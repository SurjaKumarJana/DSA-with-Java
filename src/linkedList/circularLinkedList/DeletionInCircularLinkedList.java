package linkedList.circularLinkedList;

/*
problem url: https://www.geeksforgeeks.org/problems/deletion-and-reverse-in-linked-list/1
 */

import linkedList.singlyLinkedList.Node;

public class DeletionInCircularLinkedList {

    Node deleteNode(Node head, int key) {

        //for n =1
        if (head.next == head && head.data == key) {
            return null;
        }

        //if key is present in the first Node
        if (head.data == key) {
            Node tail = head.next;
            while (tail.next != head) {
                tail = tail.next;
            }
            //after the loop executed curr points to the last node
            tail.next = head.next;

            // return new head
            return head.next;
        }

        //if key is in the middle or last
        Node prev = head;
        Node curr = head.next;

        while (curr != head) {

            if (curr.data == key) {
                //delete the curr node
                prev.next = curr.next;

                return head;

            }

            //moving the pointers
            prev = curr;
            curr = curr.next;
        }


        return head;
    }
}