package linkedList;


/*
problem url: https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwosortedLinkedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i!=null && j!=null){

            if(i.val < j.val){
                k.next = i;
                k = k.next;
                i = i.next;
            }else{
                k.next = j;
                k = k.next;
                j = j.next;
            }
        }

        if(i == null){
            k.next = j;
        }else{
            k.next = i;
        }

        return dummy.next;
    }
}
