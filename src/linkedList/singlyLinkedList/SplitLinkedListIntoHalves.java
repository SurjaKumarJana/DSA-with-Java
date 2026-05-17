package linkedList.singlyLinkedList;

/*
problem url: https://www.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1
 */


// **code has some issue**

public class SplitLinkedListIntoHalves {

/*
    public Pair<Node, Node> splitList(Node head) {
        if(head == null) return new Pair<>(null, null);

        Node slow = head;
        Node fast = head;

        while(fast.next!=head && fast.next.next!=head){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = head;

        // ODD case: fast is at last node
        if(fast.next == head)
            fast.next = head2;

            // EVEN case: fast.next is last node
        else if(fast.next.next == head)
            fast.next.next = head2;

        return new Pair<>(head,head2);
    }

 */
}
