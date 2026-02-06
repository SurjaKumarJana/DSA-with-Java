package linkedList;

/*
problem url: https://leetcode.com/problems/middle-of-the-linked-list/
 */
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        //approach 1:
        /*
         ListNode temp = head;
         int length =0;
         while(temp != null){
         length++;
         temp = temp.next;
         }
         temp = head;//now temp is pointing to the head again
         for(int i=0;i<length/2;i++){
         temp = temp.next;
         }

         return temp;
         */
        //approach 2: slow-fast approach
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
