package linkedList.singlyLinkedList;


/*
problem url: https://leetcode.com/problems/partition-list/
 */

public class PartitionList {

    public ListNode partition(ListNode head, int tar) {

        ListNode d1 = new ListNode(-1,head);
        ListNode d2 = new ListNode(-1,head);

        ListNode t1 = d1;//node to traverse linkedlist which contain small values
        ListNode t2 = d2;// it will traverse  linkedlist with higher values

        ListNode t = head;

        while(t!=null){
            if(t.val<tar){
                t1.next = t;
                t1 = t1.next;
            }else{
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1.next = null;
        t2.next = null;

        t1.next = d2.next;

        return d1.next;
    }
}
