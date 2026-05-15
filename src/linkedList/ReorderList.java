package linkedList;

/*
problem url: https://leetcode.com/problems/reorder-list/
 */
public class ReorderList {

    public void reorder(ListNode head) {

        // find left middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        // reverse second part
        head2 = reverseList(head2);

        // add atternattely
        ListNode t = head;
        ListNode t1 = t.next;
        ListNode t2 = head2;
        while(t2!=null && t1!=null){
            t.next = t2;
            t2 = t2.next;
            t = t.next;
            t.next = t1;
            t = t.next;
            t1 = t1.next;
        }
        t.next = t2;

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
