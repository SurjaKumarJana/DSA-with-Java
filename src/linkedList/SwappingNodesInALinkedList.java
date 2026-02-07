package linkedList;


/*
problem url: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
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
public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode slow= head;
        ListNode fast = head;

        for(int i=0; i<k-1;i++){
            temp = temp.next;
        }

        // after this loop temp will lead k-1 postion
        fast = temp.next;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        // now slow will point the k th node from the end
        //swap the values between slow and temp
        swap(temp,slow);

        return head;
    }
    void swap(ListNode first, ListNode second){
        int x = first.val;
        first.val = second.val;
        second.val = x;
    }
}
