package linkedList;

/*
problem url: https://leetcode.com/problems/sort-list/
 */
public class MergeSortInLinkedList {
    public ListNode sortList(ListNode head) {
        //breadk statement
        if( head == null || head.next == null) return head;

        //finding the left middle element
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        //recurssively sorting linked list
        head = sortList(head);
        head2 = sortList(head2);

        //merging list

        return merge(head,head2);

    }

    public ListNode merge(ListNode list1, ListNode list2){
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i!=null && j!=null){
            if(i.val<j.val){
                k.next = i;
                k = k.next;
                i=i.next;
            }
            else{
                k.next = j;
                k = k.next;
                j = j.next;
            }
        }
        if(i==null) k.next = j;
        else k.next = i;

        return dummy.next;
    }
}
