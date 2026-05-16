package linkedList;

/*
problem url:https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;

        ListNode dummy = new ListNode(-1,head);
        ListNode tail1 = dummy;
        ListNode head2 = null;
        ListNode tail2 = null;
        ListNode head3 = null;

        int idx = 0;
        ListNode temp = dummy; // for traverse the linked list

        // to reach left-1
        while(idx<left-1){
            idx++;
            temp = temp.next;
        }
        tail1 = temp;
        head2 = temp.next;
        // to reach right
        while(idx<right){
            idx++;
            temp = temp.next;
        }
        tail2 = temp;
        head3 = temp.next;



        // break the list
        tail1.next = null;
        tail2.next = null;

        //reverse second part
        reverseList(head2);

        //now again connect the first second(reverse) third
        tail1.next = tail2;
        head2.next = head3;


        return dummy.next;


    }

    public void reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}
