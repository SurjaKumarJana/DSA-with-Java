package linkedList;


/*
problem url: https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
 */

public class RemoveDuplicatesFromASortedLinkedList {

    Node removeDuplicates(Node head) {

        Node i = head;
        Node j = head;

        while(j!=null){
            if(i.data == j.data) j = j.next;
            else{

                i.next = j;
                i = j;
            }
        }

        i.next = j;


        return head;

    }
}
