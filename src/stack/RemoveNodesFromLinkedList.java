package stack;

import linkedList.singlyLinkedList.ListNode;

import java.util.Stack;

/*
problem url: https://leetcode.com/problems/remove-nodes-from-linked-list/
 */
public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            while (!stack.isEmpty() && temp.val > stack.peek().val) {
                stack.pop();
            }
            stack.push(temp);
            temp = temp.next;
        }

        // Reconnect in reverse
        ListNode tail = stack.pop();
        tail.next = null;

        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = tail;
            tail = node;
        }

        return tail;
    }
}
