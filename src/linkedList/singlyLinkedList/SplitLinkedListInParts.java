package linkedList.singlyLinkedList;

/*
problem url: https://leetcode.com/problems/split-linked-list-in-parts/
 */


public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        // Step 1: measure total length
        int n = 0;
        for (ListNode c = head; c != null; c = c.next) n++;

        int base = n / k;      // every part gets at least this many nodes
        int extra = n % k;     // first `extra` parts get one bonus node

        ListNode[] parts = new ListNode[k];
        ListNode cur = head;

        for (int i = 0; i < k; i++) {
            parts[i] = cur;
            int partSize = base + (i < extra ? 1 : 0);

            // Walk to the last node of this part
            for (int j = 0; j < partSize - 1; j++) cur = cur.next;

            // Sever the connection, advance cur
            if (cur != null) {
                ListNode next = cur.next;
                cur.next = null;   // cut the link
                cur = next;
            }
        }

        return parts;
    }
}
