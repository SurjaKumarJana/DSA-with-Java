package linkedList;

/*
problem url: https://leetcode.com/problems/rotate-list/
 */
public class RightRotateList {
    public ListNode rotateRight(ListNode head, int k) {

        int len = length(head);

        if(len <= 1) return head;

        k %=len;

        if(k == 0) return head;

        ListNode slow = head;
        ListNode fast = head;

        for(int i=0; i<=k; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;

        ListNode tail = newHead;

        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;


        return newHead;
    }

    public int length(ListNode head){
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
}
