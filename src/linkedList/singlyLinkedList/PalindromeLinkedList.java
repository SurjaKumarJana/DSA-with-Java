package linkedList.singlyLinkedList;

/*
problem url: https://leetcode.com/problems/palindrome-linked-list/
 */

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        //find left midddle
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        // reverse the second part of linked list
        head2 = reverseList(head2);

        ListNode i = head;
        ListNode j = head2;
        while(j!=null){
            if(i.val!=j.val) return false;

            //moving the pointers
            i = i.next;
            j = j.next;
        }
        return true;

    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;

            //moving the pointers
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
