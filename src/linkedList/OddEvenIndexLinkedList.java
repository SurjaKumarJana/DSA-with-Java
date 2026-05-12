package linkedList;


/*
problem url: https://leetcode.com/problems/odd-even-linked-list/
 */
public class OddEvenIndexLinkedList {

    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);

        ListNode t1 = d1;
        ListNode t2 = d2;

        ListNode t = head;
        int idx = 0;

        while(t!=null){

            if(idx%2 == 0){
                //even number
                t1.next = t;
                t1 = t1.next;
            }else{
                //odd number
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
            idx++;
        }

        t1.next = d2.next;
        t2.next = null;

        return d1.next;
    }
}
