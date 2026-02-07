package linkedList;


/*
problem url: https://leetcode.com/problems/linked-list-cycle-ii/
 */

public class FirstNodeOfLoopInLinkedList {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;

        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }

        if(fast==null || fast.next==null) return null;

        while(temp!=slow){
            slow = slow.next;
            temp = temp.next;
        }

        return temp;
    }

}
