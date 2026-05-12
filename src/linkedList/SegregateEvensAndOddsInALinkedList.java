package linkedList;

/*
problem url: https://www.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1
 */

public class SegregateEvensAndOddsInALinkedList {
    Node divide(Node head) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);

        Node t1 = d1;
        Node t2 = d2;

        Node t = head;

        while(t!=null){

            if(t.data%2 == 0){
                //even number
                t1.next = t;
                t1 = t1.next;
            }else{
                //odd number
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }

        t1.next = d2.next;
        t2.next = null;

        return d1.next;

    }
}
