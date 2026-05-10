package linkedList;
/*
problem url: https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedlist {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;


        while(curr!=null){
            next = curr.next;
            //connect curr with prev
            curr.next = prev;

            //move pointers
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
