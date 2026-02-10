package linkedList;

/*
problem url: https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
 */
public class LeftRotateList {
    public Node rotate(Node head, int k) {

        int len = length(head);

        if( len <= 1) return head;

        k%=len;
        if(k == 0) return head;
        Node temp = head;
        for(int i=1; i<k;i++){
            temp = temp.next;
        }

        Node newHead = temp.next;
        temp.next = null;
        Node tail = newHead;
        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = head;

        return newHead;

    }

    public int length(Node head){
        int len = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }

        return len;
    }
}
