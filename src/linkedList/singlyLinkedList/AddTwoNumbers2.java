package linkedList.singlyLinkedList;


/*
problem url: https://leetcode.com/problems/add-two-numbers-ii/
 */

public class AddTwoNumbers2 {
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Reverse both lists
        l1 = reverse(l1);
        l2 = reverse(l2);

        // Step 2: Add node by node, building result forwards
        int carry = 0;
        ListNode head = null;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) { sum += l1.val; l1 = l1.next; }
            if (l2 != null) { sum += l2.val; l2 = l2.next; }

            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;          // prepend = built-in reverse
        }

        // No Step 3 needed — prepending already gives correct order
        return head;
    }
}
