package linkedList.singlyLinkedList;


/*
problem url: https://leetcode.com/problems/remove-linked-list-elements/
 */

public class RemoveNode {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next; // skip the target node
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
