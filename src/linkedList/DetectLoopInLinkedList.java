package linkedList;

/*
problem url: https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
 */
public class DetectLoopInLinkedList {
    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }


        return false;

    }
}
