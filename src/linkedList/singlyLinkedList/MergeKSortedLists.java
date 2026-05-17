package linkedList.singlyLinkedList;


/*
problem url: https://leetcode.com/problems/merge-k-sorted-lists/
 */

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0 ) return null;

        int n = lists.length-1;

        for(int i = n;i>0;i--){
            lists[i-1] = merge(lists[i], lists[i-1]);

        }

        return lists[0];
    }


    public ListNode merge(ListNode head1, ListNode head2){
        ListNode i = head1;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next = i;
                i = i.next;

            }
            else{
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        if(i==null) k.next = j;
        else k.next = i;

        return dummy.next;
    }

}
