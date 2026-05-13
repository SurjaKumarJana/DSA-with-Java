package linkedList;


/*
problem url: https://leetcode.com/problems/swap-nodes-in-pairs/
 */

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode a = null;
        ListNode b = null;

        while(prev.next!=null && prev.next.next!=null){
            a = prev.next;
            b = prev.next.next;

            //swap
            prev.next = b;
            a.next = b.next;
            b.next = a;

            prev = a;
        }

        return dummy.next;
    }
}
